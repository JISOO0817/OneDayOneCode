package Bronze4.Day1

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    var n = br.readLine().toInt()

    for (i in n downTo 1) {
        println(i)
    }
}