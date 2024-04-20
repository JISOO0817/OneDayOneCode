package Bronze4.Day17

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    while (true) {
        val input = StringTokenizer(br.readLine())

        val name = input.nextToken().toString()
        val age = input.nextToken().toInt()
        val weight = input.nextToken().toInt()
        var grade = ""
        if (name == "#" && age == 0 && weight == 0) {
            return
        }

        grade = if (age > 17 || weight >= 80) {
            "Senior"
        } else {
            "Junior"
        }

        println("$name $grade")
    }
}