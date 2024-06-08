package Bronze3.Day14

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()
    var sum = 0
    repeat(t) {
        val s = br.readLine().toInt()
        val n = br.readLine().toInt()
        repeat(n) {
            val option = StringTokenizer(br.readLine())
            val q = option.nextToken().toInt()
            val p = option.nextToken().toInt()
            sum += p*q
        }
        println(sum + s)
        sum = 0
    }
    br.close()
}