package Bronze5.Day11

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {

    val br=  BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()

    print(getFactorial(n))
}

private fun getFactorial(n : Int): Int {
    var num = 1

    if (n > 0) {
        for (i in 1 .. n) {
            num *= i
        }
    } else {
        num = 1
    }

    return num
}