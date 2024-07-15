package Bronze2.Day3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val a = br.readLine().toInt()
    val b = br.readLine().toInt()
    val c = br.readLine().toInt()

    val multiplication = (a * b * c).toString().toCharArray()

    for (i in 0 .. 9) {
        var count = 0
        for (j in multiplication) {
            if (j.toString().toInt() == i) {
                count += 1
            }
        }
        println(count)
    }
    br.close()
}