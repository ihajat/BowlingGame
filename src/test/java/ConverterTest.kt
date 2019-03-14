import org.junit.Before
import org.junit.Test

import org.junit.Assert.*
import java.util.*

class ConverterTest {

    internal lateinit var converter: Converter
    @Before
    @Throws(Exception::class)
    fun setUp() {
        converter = Converter()
    }

    //Test 1:  test to convert standard scoring strings to array used for the Bowling Game
    @Test
    fun testStandard() {
        val rolls = converter.convert("51 51 51 51 51 51 51 51 51 51")
        val rolls2 = arrayOf(5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1)
        assertEquals(rolls, Arrays.asList(*rolls2))
    }

    //Test 2:  test to convert standard scoring strings with dashes used to signify a zero score
    @Test
    fun testStandardScoringWorksWithDashesForZeroScore() {
        val rolls = converter.convert("9- 9- 9- 9- 9- 9- 9- 9- 9- 9-")
        val rolls2 = arrayOf(9,0,9,0,9,0,9,0,9,0,9,0,9,0,9,0,9,0,9,0)
        assertEquals(rolls, Arrays.asList(*rolls2))
    }
}