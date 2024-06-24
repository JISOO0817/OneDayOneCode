package Bronze3.Day20

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()

    repeat(t) {
        val input = StringTokenizer(br.readLine())
        val c = input.nextToken().toInt()
        val v = input.nextToken().toInt()

        println("You get ${c/v} piece(s) and your dad gets ${c%v} piece(s).")
    }

    br.close()
}