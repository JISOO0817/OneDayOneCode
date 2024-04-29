package Bronze3.Day1

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val a = br.readLine().toInt()
    val b = br.readLine().toCharArray()
    var sum = 0
    var su = 1
    for (i in 2 downTo 0) {
        val temp = Integer.parseInt(b[i].toString())
        println(a * temp)
        sum += (a * temp) * su
        su *= 10
    }
    println(sum)
}