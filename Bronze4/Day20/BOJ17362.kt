package Bronze4.Day20

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    if (n % 8 == 1) {
        println(1)
    } else if (n % 8 == 0 || n % 8 == 2) {
        println(2)
    } else if (n % 8 == 3 || n % 8 == 7) {
        println(3)
    } else if (n % 8 == 4 || n % 8 == 6) {
        println(4)
    } else {
        println(5)
    }
}