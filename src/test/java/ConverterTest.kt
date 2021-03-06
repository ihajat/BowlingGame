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

    //Test 3:  test to convert scoring strings with / used to signify a spare score
    @Test
    fun testConverts() {
        val rolls = converter.convert("5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/5")
        val rolls2 = arrayOf(5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5)
        assertEquals(rolls, Arrays.asList(*rolls2))
    }

    //Test 4: test to convert scoring strings with X used to signify a strike score
    @Test
    fun test1() {
        val rolls = converter.convert("X X X X X X X X X X X X")
        val rolls2 = arrayOf(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10)
        assertEquals(rolls, Arrays.asList(*rolls2))
    }
}