package Bronze3.Day8

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    var sumOfApple = 0
    repeat(n) {
        val input = StringTokenizer(br.readLine())
        val student = input.nextToken().toInt()
        val apple = input.nextToken().toInt()
        sumOfApple += apple % student
    }
    print(sumOfApple)
    br.close()
}