package Bronze4.Day14

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = StringTokenizer(br.readLine())

    val n = input.nextToken().toInt()
    val m = input.nextToken().toInt()

    for (i in 1 .. n) {
        val num = br.readLine().toCharArray()
        for (j in m-1 downTo 0) {
            print(num[j])
        }
        println()
    }
}