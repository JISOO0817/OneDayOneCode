package Bronze3.Day16

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()
    repeat(t) {
        var num = br.readLine().toInt()
        val quarter = num/25
        num %= 25
        val dime = num/10
        num %= 10
        val nickel = num/5
        num %= 5
        val penny = num/1
        num %= 1
        println("$quarter $dime $nickel $penny")
    }
    br.close()
}