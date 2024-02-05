package Day3

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = StringTokenizer(br.readLine())

    val A = input.nextToken().toInt()
    val B = input.nextToken().toInt()

    br.close()

    if (A > B) {
        println(">")
    } else if (A < B) {
        println("<")
    } else {
        println("==")
    }
}