fun main() {
    // put your code here
    val n = readln().toInt()
    var numPositive = 0

    repeat(n) {
        val number = readln().toInt()

        if (number > 0) numPositive++
    }

    println(numPositive)
}