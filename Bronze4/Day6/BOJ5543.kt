package Bronze4.Day6

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val foodList = arrayListOf<Int>()

    repeat(5) {
        foodList.add(br.readLine().toInt())
    }

    val burgers = foodList.toMutableList().subList(0,3)
    burgers.sortBy { it }
    val drinks = foodList.toMutableList().subList(3,foodList.size)
    drinks.sortBy { it }

    print(burgers.first() + drinks.first() - 50)

}