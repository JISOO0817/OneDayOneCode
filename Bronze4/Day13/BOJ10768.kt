package Bronze4.Day13

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val month = br.readLine().toInt()
    val day = br.readLine().toInt()

    if (month < 2) {
        print("Before")
    } else if (month == 2) {
        if (day < 18) {
            print("Before")
        } else if (day == 18) {
            print("Special")
        } else {
            print("After")
        }
    } else {
        print("After")
    }
}