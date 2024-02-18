package Day12

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    while(true) {
        val input: String = br.readLine() ?: break
        println(input)
    }
}