package Bronze3.Day19

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    var count = 0
    repeat(n) {
        count ++
        val input = StringTokenizer(br.readLine())
        println("Case $count: ${input.nextToken().toInt() + input.nextToken().toInt()}")
    }
    br.close()
}