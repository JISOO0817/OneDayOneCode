package Day2

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val score = StringTokenizer(br.readLine()).nextToken().toInt()
    br.close()
    when (score) {
        in 90..100 -> print("A")
        in 80 .. 89 -> print("B")
        in 70 .. 79 -> print("C")
        in 60 .. 69 -> print("D")
        else -> print("F")
    }
}