package Bronze3.Day7

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    var maxX = -10001
    var minX = 10001
    var maxY = -10001
    var minY = 10001
    repeat(n) {
        val input = StringTokenizer(br.readLine())
        val x = input.nextToken().toInt()
        val y = input.nextToken().toInt()
        if (x > maxX) maxX = x
        if (x < minX) minX = x
        if (y > maxY) maxY = y
        if (y < minY) minY = y
    }
    br.close()
    print((maxX - minX) * (maxY - minY))
}

