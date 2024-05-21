package Bronze3.Day8

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = StringTokenizer(br.readLine())
    val list = arrayListOf<Int>()
    repeat(3) {
        list.add(input.nextToken().toInt())
    }
    list.sort()
    if (list[2] >= list[0] + list[1]) {
        list[2] = list[0] + list[1] - 1
    }
    print(list.sum())
    br.close()
}