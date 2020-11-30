import junit.framework.Assert.assertEquals
import org.junit.Test

class AdditionTests {
    @Test
    fun sum_2_numbers() {

        var initialNumber = 2
        var numToSum = 2
        var expectedResult = 4F

        var calculator = Calculator()
        calculator.add(initialNumber)
        calculator.add(numToSum)

        assertEquals(expectedResult, calculator.result)
    }

    @Test
    fun sum_3_numbers() {

        var initialNumber = 2
        var secondNumber = 3
        var thirdNumber = 1
        var expectedResult = 6F

        var calculator = Calculator()
        calculator.add(initialNumber)
        calculator.add(secondNumber)
        calculator.add(thirdNumber)

        assertEquals(expectedResult, calculator.result)
    }

    @Test
    fun subtract2numbers() {

        var initialNumber = 3F
        var secondNumber = 2
        var expectedResult = 1F

        var calculator = Calculator(initialNumber)
        calculator.minus(secondNumber)

        assertEquals(expectedResult, calculator.result)
    }

    @Test
    fun multiply_2_numbers() {

        var initialNumber = 2F
        var secondNumber = 3
        var expectedResult = 6.0F

        var calculator = Calculator(initialNumber)
        calculator.mul(secondNumber)

        assertEquals(expectedResult, calculator.result)
    }

    @Test
    fun multiply_2_decimal_numbers() {

        var initialNumber = 2.2F
        var secondNumber = 3.6F
        var expectedResult = 7.92F

        var calculator = Calculator(initialNumber)
        calculator.mul(secondNumber)

        assertEquals(expectedResult, calculator.result)
    }
}


