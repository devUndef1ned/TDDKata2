class StringCalculator {

    val firstSeparator = ","
    val secondSeparator = "\n"

    fun add(numbers: String): Int {
        if (numbers.isEmpty()) {
            return 0
        }

        return sumOfNumbers(numbers)
    }

    private fun sumOfNumbers(numbers: String): Int {
        var numbersArray = numbers.split(firstSeparator, secondSeparator)
        var sum = 0

        for (number in numbersArray) {
            sum += number.toInt()
        }

        return sum
    }
}