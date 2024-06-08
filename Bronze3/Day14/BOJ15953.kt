package Bronze3.Day14

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()
    val firstFestival = arrayListOf(
        0,
        500,
        300,
        300,
        200,
        200,
        200,
        50,
        50,
        50,
        50,
        30,
        30,
        30,
        30,
        30,
        10,
        10,
        10,
        10,
        10,
        10
    )

    val secondFestival = arrayListOf(
        0,
        512,
        256,
        256,
        128,
        128,
        128,
        128,
        64,
        64,
        64,
        64,
        64,
        64,
        64,
        64,
        32,
        32,
        32,
        32,
        32,
        32,
        32,
        32,
        32,
        32,
        32,
        32,
        32,
        32,
        32,
        32)

        repeat(t) {
            val input = StringTokenizer(br.readLine())
            var a = input.nextToken().toInt()
            var b = input.nextToken().toInt()

            if (a > 21) {
                a = 0
            }

            if (b > 31) {
               b = 0
            }

            println((firstFestival[a] + secondFestival[b]) * 10000)
        }

    br.close()
}