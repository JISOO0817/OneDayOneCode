package Silver3

import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()

    val n = br.readLine().toInt()
    val m = br.readLine().toInt()

    val graph = Array(n + 1) { mutableListOf<Int>() }

    val st = StringTokenizer(br.readLine())
    repeat(m) {
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()

        graph[a].add(b)
        graph[b].add(a)
    }

    val infected  = countInfectedComputers(graph, n)
    println(infected - 1)
}

fun countInfectedComputers(graph: Array<MutableList<Int>>, n: Int): Int {
    val visited = BooleanArray(n + 1)

    val queue: Queue<Int> = LinkedList()

    queue.add(1)
    visited[1] = true

    var count = 0

    while(queue.isNotEmpty()) {
        val current = queue.poll()
        count ++

        for (next in graph[current]) {
            if (!visited[next]) {
                queue.add(next)
                visited[next] = true
            }
        }
    }
    return count
}