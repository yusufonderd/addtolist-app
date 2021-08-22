package com.yonder.addtolist.core.extensions

/**
 * @author yusuf.onder
 * Created on 23.07.2021
 */

const val EMPTY_STRING = ""

fun String.toNumericString() = this.filter { it.isDigit() }
