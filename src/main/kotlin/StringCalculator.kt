class StringCalculator {

    val separator = ","

    fun add(numbers: String): Int {
        if (numbers.isEmpty()) {
            return 0
        }
        if (!numbers.contains(separator)) {
            return numbers.toInt()
        }
        var separatorIndex = numbers.indexOf(separator)
        var first = numbers.substring(0, separatorIndex).toInt()
        var second = numbers.substring(separatorIndex + 1).toInt()

        return first + second
    }
}