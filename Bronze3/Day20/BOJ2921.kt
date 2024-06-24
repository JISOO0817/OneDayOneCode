package Bronze3.Day20

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    var sum = 0
    for (i in 1 .. n) {
        for (j in 0 .. i) {
            sum += i + j
        }
    }
    println("$sum")
    br.close()
}