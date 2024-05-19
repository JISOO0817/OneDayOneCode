package Bronze3.Day6

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val m = br.readLine().toInt()
    val numList = mutableListOf(0,1,0,0)
    repeat(m) {
        val input = StringTokenizer(br.readLine())
        val x = input.nextToken().toInt()
        val y = input.nextToken().toInt()
        Collections.swap(numList,x,y)
    }

    print(numList.indexOf(1))
}