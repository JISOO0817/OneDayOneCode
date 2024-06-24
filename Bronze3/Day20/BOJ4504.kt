package Bronze3.Day20

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()

    while (true) {
        val num = br.readLine().toInt()
        if (num == 0) {
            break
        }

        if (num % n == 0) {
            println("$num is a multiple of $n.")
        } else {
            println("$num is NOT a multiple of $n.")
        }
    }
    br.close()
}