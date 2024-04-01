package Bronze4.Day11

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    while (true) {
        val inputString = br.readLine()
        if (inputString.equals("END")) {
            return
        }
        val input = inputString.toCharArray()
        for (k in input.size-1 downTo 0) {
            print(input[k])
        }
        println()
    }
}