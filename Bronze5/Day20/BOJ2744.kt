package Bronze5.Day20

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val string = br.readLine()
    val stringArray = string.toCharArray()
    var result = ""
    for (arr in stringArray) {
       result += if (arr.isUpperCase()) {
           arr.lowercase()
       } else {
           arr.uppercase()
       }
    }
    print(result)
}