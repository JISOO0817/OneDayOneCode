package Bronze3.Day13

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val r = br.readLine().toInt()
    println(Math.PI*r*r)
    println(2*r*r)
    br.close()
}