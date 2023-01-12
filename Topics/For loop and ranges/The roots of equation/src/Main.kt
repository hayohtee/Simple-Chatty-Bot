fun main() {
    // put your code here
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val d = readln().toInt()

    for (x in 0..1000) {
        val equation = (a * x * x * x) + (b * x * x) + (c * x) + d

        if (equation == 0) {
            println(x)
        }
    }
}