package Bronze3.Day3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var max = 0
    var cnt = 0
    var maxCnt = 0
    repeat(9) {
        val input = br.readLine().toInt()
        cnt ++
        if (max < input) {
            max = input
            maxCnt = cnt
        }
    }
    println("$max")
    println("$maxCnt")
}