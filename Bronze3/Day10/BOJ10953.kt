package Bronze3.Day10

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()
    repeat(t) {
        val numInput = StringTokenizer(br.readLine(),",")
        val a = numInput.nextToken().toInt()
        val b = numInput.nextToken().toInt()
        println(a + b)
    }
    br.close()
}