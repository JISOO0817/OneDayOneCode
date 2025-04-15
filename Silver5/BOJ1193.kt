package Silver5

fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    var count = 1
    var x = 1
    var y = 1
    var dir = 1
    while (count < n) {
        if (x == 1 && dir == 1) {
            y ++
            dir = -1
        } else if (y == 1 && dir == -1) {
            x ++
            dir = 1
        } else if (dir == 1) {
            x --
            y ++
        } else {
            x ++
            y --
        }
        count ++
    }

    println("$x/$y")
}