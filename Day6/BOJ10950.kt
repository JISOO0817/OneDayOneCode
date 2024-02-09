package Day6

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())

    val t = st.nextToken().toInt()

    for(i in 1 .. t) {
        val line = br.readLine()
        val input = StringTokenizer(line)

        val a = input.nextToken().toInt()
        val b = input.nextToken().toInt()
        println(a + b)
    }
}