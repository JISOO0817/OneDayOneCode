package Bronze5.Day6

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = br.readLine().toInt()
    val sb = StringBuffer()

    for(i in 1 .. n) {
        sb.append(i).append("\n")
    }
    println(sb.toString())
}