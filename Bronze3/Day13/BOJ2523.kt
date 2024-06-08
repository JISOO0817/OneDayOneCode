package Bronze3.Day13

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()

    for (i in 0 until 2 * n - 1) {
        for (j in 0 until n) {
            if (i+1 <= n && j <= i || i >= n && 2 * n - 1 - i > j) {
                print("*")
            } else {
                break
            }
        }
        println()
    }
    br.close()
}