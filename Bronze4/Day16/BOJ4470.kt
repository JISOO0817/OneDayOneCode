package Bronze4.Day16

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val N = br.readLine().toInt()

    repeat(N) { number ->
        val st = br.readLine()
        println("${number + 1}. $st")
    }
}