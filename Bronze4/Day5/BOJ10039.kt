package Bronze4.Day5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var sum = 0
    repeat(5) {
        var input = br.readLine().toInt()
        if (input < 40) {
            input = 40
        }
        sum += input
    }

    print(sum/5)
}