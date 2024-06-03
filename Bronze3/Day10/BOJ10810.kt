package Bronze3.Day10

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = StringTokenizer(br.readLine())
    val n = input.nextToken().toInt()
    val m = input.nextToken().toInt()
    val ballArrays = Array(n+1) { 0 }
    repeat(m) {
        val ballInput = StringTokenizer(br.readLine())
        val a = ballInput.nextToken().toInt()
        val b = ballInput.nextToken().toInt()
        val num = ballInput.nextToken().toInt()
        for (i in a .. b) {
            ballArrays[i] = num
        }
    }
    for (i in 1 .. n) {
        print("${ballArrays[i]} ")
    }
    br.close()
}