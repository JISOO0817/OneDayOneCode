package Bronze3.Day18

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var count = 1
    val orderList = arrayListOf<Int>()
    repeat(5) {
        val input = br.readLine()
        if (input.contains("FBI")) {
            orderList.add(count)
        }
        count ++
    }

    if (orderList.isEmpty()) {
        print("HE GOT AWAY!")
    } else {
        for (i in orderList) {
            print("$i ")
        }
    }

    br.close()
}