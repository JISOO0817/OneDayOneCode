package Day2

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = StringTokenizer(br.readLine())

    val a = input.nextToken().toInt()
    val b = input.nextToken().toInt()

    println(a + b)
    println(a - b)
    println(a * b)
    println(a / b)
    println(a % b)
}