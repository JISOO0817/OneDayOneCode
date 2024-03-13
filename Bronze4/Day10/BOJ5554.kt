package Bronze4.Day10

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var resultSecond = 0
    repeat(4) {
        resultSecond += br.readLine().toInt()
    }

    println(resultSecond / 60)
    println(resultSecond % 60)
}