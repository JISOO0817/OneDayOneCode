package Bronze2.Day1

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val set = mutableSetOf<Int>()
    repeat(10) {
        val num = br.readLine().toInt()
        set.add(num % 42)
    }
    br.close()
    println("${set.size}")
}