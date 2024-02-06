package Day5

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = StringTokenizer(br.readLine()).nextToken().toInt()

    var sum = 0

    for(i in 1 .. n) {
        sum += i
    }

    print(sum)
}