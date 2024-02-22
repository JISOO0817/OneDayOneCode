package Day17

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()

    for (i in 0 until t) {
        val st = br.readLine()
        println("${st[0]}${st[st.length-1]}")
    }
}