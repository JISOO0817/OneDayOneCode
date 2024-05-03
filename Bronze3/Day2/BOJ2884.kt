package Bronze3.Day2

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = StringTokenizer(br.readLine())
    var hour = input.nextToken().toInt()
    var minute = input.nextToken().toInt()

    if (minute >= 45) {
        minute -= 45
    } else {
        if ( hour == 0) {
            hour = 23
        } else {
            hour -= 1
        }

        minute = (minute + 60) - 45
    }

    print("$hour $minute")
    br.close()
}