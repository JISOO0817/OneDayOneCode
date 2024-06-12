package Bronze3.Day17

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var sum = 0
    var min = 100
    repeat(7) {
        val num = br.readLine().toInt()
        if (num % 2 != 0) {
            sum += num
            if (min > num) {
                min = num
            }
        }
    }
    if (sum == 0) {
        print("-1")
    } else {
        println("$sum")
        println("$min")
    }
    br.close()
}