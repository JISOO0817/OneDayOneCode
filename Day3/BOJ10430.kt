package Day3

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = StringTokenizer(br.readLine())

    val A = input.nextToken().toInt()
    val B = input.nextToken().toInt()
    val C = input.nextToken().toInt()

    println("${(A + B) % C}")
    println("${((A % C) + (B % C)) % C}")
    println("${(A * B) % C}")
    println("${((A % C) * (B % C)) % C}")
}