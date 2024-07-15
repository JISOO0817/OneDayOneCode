package Bronze2.Day3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()

    repeat(t) {
        val input = br.readLine().toCharArray()
        var sum = 0
        var isX = 0
        for (i in input) {
            if (i == 'X') {
                isX = 0
            } else if (i == 'O') {
                isX += 1
                sum += isX
            }
        }
        println(sum)
    }
    br.close()
}