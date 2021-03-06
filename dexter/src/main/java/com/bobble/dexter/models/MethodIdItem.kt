package com.bobble.dexter.models

import java.nio.ByteBuffer

data class MethodIdItem(
        var classIdx: Short,
        var protoIdx: Short,
        var nameIdx: Int
) {
    companion object {
        val size: Int = 8
    }

    constructor(byteBuffer: ByteBuffer) : this(
            classIdx = byteBuffer.short,
            protoIdx = byteBuffer.short,
            nameIdx = byteBuffer.int
    )

    constructor():this(
            classIdx = 0,
            protoIdx = 0,
            nameIdx = 0
    )
}