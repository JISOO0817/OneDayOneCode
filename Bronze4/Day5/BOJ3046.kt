package Bronze4.Day5

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    /**
     * s = (r1+r2)/2
     * 2s = r1 + r2
     * r2 = 2s - r1
     * */
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = StringTokenizer(br.readLine())
    val r1 = input.nextToken().toInt()
    val s = input.nextToken().toInt()

    print(2 * s - r1)
}