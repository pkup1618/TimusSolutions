import kotlin.math.max
import kotlin.text.split

private lateinit var stones: List<Int>
private var half_W = 0.0

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    stones = readLine()!!
        .split(' ')
        .map { it.toInt() }

    half_W = stones.sum() / 2.0

    val delta = half_W - m(n, half_W)
    val answer = (delta * 2).toInt()

    println(answer)
}

private fun m(i: Int, W: Double): Int {
    return when (i == 0) {
        true -> 0
        false -> {
            when (w(i) > W) {
                true -> m(i - 1, W)
                false -> max(
                    m(i - 1, W),
                    m(i - 1, W - w(i)) + w(i)
                )
            }
        }
    }
}

private fun w(i: Int): Int = stones[i - 1]


// Интересные алгоритмические
//          задачи
