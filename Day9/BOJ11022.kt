package Day9

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val st = StringTokenizer(br.readLine())
    val T = st.nextToken().toInt()

    for (i in 1 .. T) {
        val input = StringTokenizer(br.readLine())
        val A = input.nextToken().toInt()
        val B = input.nextToken().toInt()

        println("Case #${i}: $A + $B = ${A + B}")
    }
}