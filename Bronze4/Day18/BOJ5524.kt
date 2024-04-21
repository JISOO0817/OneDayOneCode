package Bronze4.Day18

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val num = br.readLine().toInt()
    repeat(num) {
        val str =  br.readLine()
        println(str.toLowerCase())
    }
}