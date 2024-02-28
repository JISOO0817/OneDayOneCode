package Bronze5.Day1

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val A = scanner.nextInt()
    val B = scanner.nextInt()

    print(A + B)


    // answer 2

    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = StringTokenizer(br.readLine())
    print(Integer.parseInt(input.nextToken()) + Integer.parseInt(input.nextToken()))
}