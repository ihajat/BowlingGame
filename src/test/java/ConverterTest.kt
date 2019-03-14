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

    @Test
    fun testStandard() {
        val rolls = converter.convert("51 51 51 51 51 51 51 51 51 51")
        val rolls2 = arrayOf(5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1)
        assertEquals(rolls, Arrays.asList(*rolls2))
    }
}