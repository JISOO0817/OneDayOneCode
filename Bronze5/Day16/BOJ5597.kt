package Bronze5.Day16

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val studentAllList = Array(30) { false }
    repeat(28) {
        val index = br.readLine().toInt()
        studentAllList[index - 1] = true
    }

    studentAllList.forEachIndexed { index, value ->
        if (!value) {
            println(index + 1)
        }
    }
}