package Bronze3.Day2

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    var max = Int.MIN_VALUE
    var min = Int.MAX_VALUE
    val input = StringTokenizer(br.readLine())

    for (i in 0 until n) {
        val temp = input.nextToken().toInt()
        max = maxOf(temp,max)
        min = minOf(temp,min)
    }

    print("$min $max")
    br.close()
}