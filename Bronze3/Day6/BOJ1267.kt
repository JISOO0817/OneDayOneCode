package Bronze3.Day6

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val input = StringTokenizer(br.readLine())
    var ys = 0
    var ms = 0
    repeat(n) {
        val num = input.nextToken().toInt()
        ys += ((num / 30)+ 1) * 10
        ms += ((num / 60)+1) * 15
    }
    if (ys == ms) {
        println("Y M $ys")
    } else if ( ys > ms) {
        println("M $ms")
    } else {
        println("Y $ys")
    }
}