class Calculator(var result: Float = 0F) {
    fun add(numToSum: Int) {
        result += numToSum
    }

    fun minus(number: Int) {
        result -= number
    }

    fun mul(otherNumber: Int) {
        result *=otherNumber
    }

    fun mul(otherNumber: Float) {
        result *=otherNumber
    }
}
