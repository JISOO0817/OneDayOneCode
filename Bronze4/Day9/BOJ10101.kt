package Bronze4.Day9

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val a = br.readLine().toInt()
    val b = br.readLine().toInt()
    val c = br.readLine().toInt()

    if ( a + b + c != 180) {
        print("Error")
    } else {
        when {
            a == b && b == c -> {
                print("Equilateral")
            }
            a == b || b == c || c == a -> {
                print("Isosceles")
            }
            else -> {
                print("Scalene")
            }
        }
    }
}