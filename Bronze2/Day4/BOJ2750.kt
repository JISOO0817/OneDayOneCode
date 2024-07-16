package Bronze2.Day4

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val numbers = arrayListOf<Int>()
    repeat(n) {
        val num = br.readLine().toInt()
        numbers.add(num)
    }

    br.close()
    numbers.sort()
    for (i in numbers) {
        println(i)
    }
}