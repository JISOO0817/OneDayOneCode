package Bronze5.Day15

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.pow

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = StringTokenizer(br.readLine())

    var sum = 0
    while (input.hasMoreTokens()) {
        val num = input.nextToken().toDouble()
        sum += num.pow(2).toInt()
    }

    print(sum % 10)
}