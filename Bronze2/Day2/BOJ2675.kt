package Bronze2.Day2

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()
    repeat(t) {
        val input = StringTokenizer(br.readLine())
        val r = input.nextToken().toInt()
        val s = input.nextToken().toCharArray()

        for (i in s.indices) {
            for (j in 0 until r) {
                print("${s[i]}")
            }
        }
        println()
    }
    br.close()
}