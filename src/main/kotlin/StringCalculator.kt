class StringCalculator {

    val separator = ","

    fun add(numbers: String): Int {
        if (numbers.isEmpty()) {
            return 0
        }
        if (!numbers.contains(separator)) {
            return numbers.toInt()
        }
        return sumOfNumbers(numbers)
    }

    private fun sumOfNumbers(numbers: String): Int {
        var numbersArray = numbers.split(separator)
        var sum = 0

        for (number in numbersArray) {
            sum += number.toInt()
        }

        return sum
    }
}