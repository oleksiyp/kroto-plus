package com.github.marcoferrer.krotoplus.generators

import com.github.marcoferrer.krotoplus.script.ScriptManager
import com.google.protobuf.compiler.PluginProtos
import com.squareup.kotlinpoet.FileSpec
import java.io.File
import kotlin.script.templates.standard.ScriptTemplateWithArgs

interface Generator : () -> PluginProtos.CodeGeneratorResponse {

    val context: GeneratorContext
        get() = contextInstance

    val isEnabled: Boolean
        get() = false

    fun FileSpec.toResponseFileProto(): PluginProtos.CodeGeneratorResponse.File =
        PluginProtos.CodeGeneratorResponse.File.newBuilder()
            .apply {
                val basePath = packageName.replace(".", "/")
                val fileName = "${this@toResponseFileProto.name}.kt"

                name = if (basePath.isNotEmpty())
                    "$basePath/$fileName" else fileName

                content = this@toResponseFileProto.toString()
            }
            .build()

    companion object {
        const val AutoGenerationDisclaimer =
            "THIS IS AN AUTOGENERATED FILE. DO NOT EDIT THIS FILE DIRECTLY."
    }
}

val ScriptTemplateWithArgs.context: GeneratorContext
    get() = contextInstance

val ScriptManager.context: GeneratorContext
    get() = contextInstance

internal fun initializeContext() {
    contextInstance
}

private val contextInstance by lazy {
    val inputStream = System.getProperty("krotoplus.debug.request.src")
        ?.let { File(it).inputStream() }
        ?: System.`in`

    val protoRequest = PluginProtos.CodeGeneratorRequest.parseFrom(inputStream)
    GeneratorContext(protoRequest)
}


