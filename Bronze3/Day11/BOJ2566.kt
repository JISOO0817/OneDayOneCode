package Bronze3.Day11

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var maxNum = 0
    var row = 0
    var column = 0
    for (i in 1 .. 9) {
        val input = StringTokenizer(br.readLine())
        for (j in 1 .. 9) {
            val temp = input.nextToken().toInt()
            if ( maxNum <= temp) {
                maxNum = temp
                row  = i
                column = j
            }
        }
    }
    br.close()
    println(maxNum)
    print("$row $column")
}