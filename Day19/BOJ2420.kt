package Day19

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.abs

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val input = StringTokenizer(br.readLine())
    val n = input.nextToken().toLong()
    val m = input.nextToken().toLong()

    val result = abs(n - m)
    print(result)
}