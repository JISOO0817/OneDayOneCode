package Bronze4.Day11

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val dataList = arrayListOf('a','e','i','o','u')
    while (true) {
        val input = br.readLine()
        var count = 0
        for (i in input.trim()) {
            when(i.toString()) {
                ",",".","!","?" -> {
                }
            }
            if (dataList.contains(i.lowercaseChar())) {
                count += 1
            }
        }
        if (input.equals("#")) {
            return
        }
        println(count)
    }
}