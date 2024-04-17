package Bronze4.Day15

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val num = br.readLine().toInt()
    print(((2.0).pow(num)).toInt())
}