package Silver5

import java.util.StringTokenizer

fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()

    val points = Array(n) { IntArray(2) }

    for (i in 0 until n) {
        val str = StringTokenizer(br.readLine())
        points[i][0] = str.nextToken().toInt()
        points[i][1] = str.nextToken().toInt()
    }

    points.sortWith(compareBy({it[0]}, {it[1]}))

    for (point in points) {
        println("${point[0]} ${point[1]}")
    }

}