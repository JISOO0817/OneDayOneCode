package Day8

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()

    for(i in 1..n) {
        val input = br.readLine()
        val st = StringTokenizer(input)
        val A = st.nextToken().toInt()
        val B = st.nextToken().toInt()

        println("Case #${i}: ${A + B}")
    }
}