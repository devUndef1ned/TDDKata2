import org.junit.Assert
import org.junit.Before
import org.junit.Test

class StringCalculatorTests {

    private lateinit var calculator: StringCalculator

    @Before
    fun setUp() {
        calculator = StringCalculator()
    }

    @Test
    fun whenAdd_anEmptyString_shouldReturnZeroValue() {
        var arg = ""

        Assert.assertEquals(0, calculator.add(arg))
    }

    @Test
    fun whenAdd_singleNumber_shouldReturnTheSameValue() {
        var arg = "4"

        Assert.assertEquals(4, calculator.add(arg))
    }

    @Test
    fun whenAdd_twoNumbersSeparatedByComma_shouldReturnTheirSum() {
        var arg = "5,9"

        Assert.assertEquals(14, calculator.add(arg))
    }

    @Test
    fun whenAdd_severalNumbersSeparatedByComma_shouldReturnTheirSum() {
        var arg = "5,4,3,2,1"

        Assert.assertEquals(15, calculator.add(arg))
    }

    @Test
    fun whenAdd_severalNumbersSeparatedByCommaAndNewLineSymbol_shouldReturnTheirSum() {
        var arg = "5,4\n3\n2,1"

        Assert.assertEquals(15, calculator.add(arg))
    }

}