package Bronze3.Day16

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    for (i in 0 until 2*n-1) {
        for (j in 0 until n) {
            if ((i < n && i + j >= n-1) || i >= n && i - j  < n) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
    br.close()
}