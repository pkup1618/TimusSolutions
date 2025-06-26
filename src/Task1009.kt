
fun f(n: Int, k: Int): Long {
    return when (n) {
        1 -> (k - 1).toLong()
        2 -> (f(1, k) + 1) * (k - 1)
        else -> (f(n - 1, k) + f(n - 2, k)) * (k - 1)
    }
}

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val k = readLine()!!.toInt()

    print(f(n, k))
}

