package Bronze4.Day12

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    var count = 1
    repeat(n) {
        println("Hello World, Judge $count!")
        count ++
    }
}