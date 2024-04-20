package Bronze4.Day17

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    repeat(br.readLine().toInt()) {
        val size = br.readLine().toInt()
        val code ="="
        repeat(size) {
            print(code)
        }
        println()
    }
}