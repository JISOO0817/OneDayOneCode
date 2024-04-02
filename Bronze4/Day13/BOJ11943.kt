package Bronze4.Day13

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val firstArray = Array(2) { 0 }
    val secondArray = Array(2) { 0 }
    val a = StringTokenizer(br.readLine())
    firstArray[0] = a.nextToken().toInt()
    firstArray[1] = a.nextToken().toInt()
    val b = StringTokenizer(br.readLine())
    secondArray[0] = b.nextToken().toInt()
    secondArray[1] = b.nextToken().toInt()
    val result = Math.min((firstArray[0] + secondArray[1]), (firstArray[1] + secondArray[0]))
    print(result)
}