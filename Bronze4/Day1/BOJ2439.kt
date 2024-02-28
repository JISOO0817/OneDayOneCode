package Bronze4.Day1

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()

    for (i in 1..n) {
        for (j in 1..n) {
            if (j < n - i + 1) {
                print(" ")
            } else {
                print("*")
            }
        }
        println()
    }
}