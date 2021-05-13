package com.hao.testunit

object MainC {
    @JvmStatic
    fun main(args: Array<String>) {

        val list = mutableListOf(
            1, 2, 1, 25, 1, 857, 51, 56, 1, 2, 857, 51
        )
        list.distinct().forEach { println("${it},") }
    }
}