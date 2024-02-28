package Bronze5.Day18

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = StringTokenizer(br.readLine())
    val n = input.nextToken().toInt()
    val m = input.nextToken().toInt()

    val arrA = Array(n) { IntArray(m)}
    val arrB = Array(n) { IntArray(m)}

    for ( i in 0 until n) {
        val num = br.readLine()
        val inputNum = StringTokenizer(num)

        for (j in 0 until m) {
            val nums = inputNum.nextToken().toInt()
            arrA[i][j] = nums
        }
    }

    for ( i in 0 until n) {
        val num = br.readLine()
        val inputNum = StringTokenizer(num)
        for (j in 0 until m) {
            val nums = inputNum.nextToken().toInt()
            arrB[i][j] = nums
        }
    }

    for ( i in 0 until n) {
        for (j in 0 until  m) {
            print("${arrA[i][j] + arrB[i][j]}")
            print(" ")
        }
        println()
    }

}