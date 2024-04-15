package Bronze4.Day14

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    var sum = 0
    var minA = Integer.MAX_VALUE
    var minB = Integer.MAX_VALUE
    val br = BufferedReader(InputStreamReader(System.`in`))
    repeat(4) {
        val temp = br.readLine().toInt()
        sum += temp
        if (temp < minA) {
            minA = temp
        }
    }

    repeat(2) {
        val temp = br.readLine().toInt()
        sum += temp
        if (temp < minB) {
            minB = temp
        }
    }

    println(sum - minA - minB)
}