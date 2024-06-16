package Bronze3.Day18

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var sum = 0
    while (true) {
        val num = br.readLine().toCharArray()
        if (num[0] == '0') {
            break
        }

        for (i in num.iterator()) {
            sum += when (i) {
                '1' -> {
                    2
                }
                '0' -> {
                    4
                }
                else -> {
                    3
                }
            }
        }

        sum += num.size + 1
        println("$sum")
        sum = 0
    }

    br.close()
}