package Bronze5.Day3

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val N = StringTokenizer(br.readLine()).nextToken().toInt()

    for (i in 1 .. 9) {
        println("$N * $i = ${(N * i)}")
    }
}