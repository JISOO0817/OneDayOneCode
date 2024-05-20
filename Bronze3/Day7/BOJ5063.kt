package Bronze3.Day7

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    repeat(n) {
        val input = StringTokenizer(br.readLine())
        val r = input.nextToken().toInt()
        val e = input.nextToken().toInt()
        val c = input.nextToken().toInt()
        if (r < e - c) {
            println("advertise")
        } else if (r == e-c) {
            println("does not matter")
        } else {
            println("do not advertise")
        }
    }
    br.close()
}