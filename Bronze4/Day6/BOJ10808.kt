package Bronze4.Day6

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val s = br.readLine().toCharArray()
    val result = IntArray(26)

    for (i in 0 until s.size) {
        result[(s[i] - 97).toInt()]++
    }

    for (i in result.indices) {
        print("${result[i]} ")
    }
}