package Bronze3.Day11

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    for (i in 0 until n) {
        for (j in 0 until 2 * n - 1 - i) {
            if (j >= i) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
    br.close()
}