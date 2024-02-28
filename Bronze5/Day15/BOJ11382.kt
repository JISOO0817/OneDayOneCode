package Bronze5.Day15

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = StringTokenizer(br.readLine())

    val a = input.nextToken().toLong()
    val b = input.nextToken().toLong()
    val c = input.nextToken().toLong()

    print(a + b + c)
}