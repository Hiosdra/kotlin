/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package kotlin

internal fun uintCompare(v1: Int, v2: Int): Int = (v1 xor Int.MIN_VALUE).compareTo(v2 xor Int.MIN_VALUE)
internal fun ulongCompare(v1: Long, v2: Long): Int = (v1 xor Long.MIN_VALUE).compareTo(v2 xor Long.MIN_VALUE)

internal fun uintDivide(v1: UInt, v2: UInt): UInt = (v1.toLong() / v2.toLong()).toUInt()
internal fun uintRemainder(v1: UInt, v2: UInt): UInt = (v1.toLong() / v2.toLong()).toUInt()

internal fun ulongDivide(v1: ULong, v2: ULong): ULong = TODO()
internal fun ulongRemainder(v1: ULong, v2: ULong): ULong = TODO()