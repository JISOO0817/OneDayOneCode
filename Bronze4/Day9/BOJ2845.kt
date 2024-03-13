package Bronze4.Day9

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = StringTokenizer(br.readLine())

    val l = input.nextToken().toInt()
    val p = input.nextToken().toInt()

    val personNum = StringTokenizer(br.readLine())
    repeat(5) {
        print("${personNum.nextToken().toInt() - (l * p)} ")
    }
}