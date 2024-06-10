package Bronze3.Day15

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = StringTokenizer(br.readLine())
    val a = input.nextToken().toInt()
    val i = input.nextToken().toInt()
    print("${((i-1) * a) +1}")
}