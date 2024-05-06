package Bronze3.Day5

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = StringTokenizer(br.readLine())
    val x = input.nextToken().toInt()
    val y = input.nextToken().toInt()
    val w = input.nextToken().toInt()
    val h = input.nextToken().toInt()
    val xMin = Math.min(x,w-x)
    val yMin = Math.min(y, h-y)
    print(Math.min(xMin,yMin))
}