package Bronze3.Day12

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()

    for (i in 0 until n) {
        for (j in 0 until n + i) {
            if (j == n - i - 1 || j == n + i - 1) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
    br.close()
}