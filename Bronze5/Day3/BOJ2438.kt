package Bronze5.Day3

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = StringTokenizer(br.readLine()).nextToken().toInt()

    br.close()
    for (i in 1..n) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
}