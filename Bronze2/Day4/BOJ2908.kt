package Bronze2.Day4

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = StringTokenizer(br.readLine())
    val a = input.nextToken().toCharArray()
    val b = input.nextToken().toCharArray()

    val aOpposite = (a[2].toString() + a[1].toString() + a[0].toString()).toInt()
    val bOpposite = (b[2].toString() + b[1].toString() + b[0].toString()).toInt()

    br.close()
    print(maxOf(aOpposite,bOpposite))
}