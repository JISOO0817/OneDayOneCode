package Bronze4.Day10

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val input = StringTokenizer(br.readLine())
    var mgSum = 0
    repeat(4) {
        mgSum += input.nextToken().toInt()
    }

    val msInput = StringTokenizer(br.readLine())
    var msSum = 0
    repeat(4) {
        msSum += msInput.nextToken().toInt()
    }
    if (mgSum == msSum) {
        print(mgSum)
    } else {
        print(maxOf(mgSum,msSum))
    }
}