import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

internal class BowlingGameTest {

    lateinit var game: BowlingGame

    @Before
    fun setUp() {
        game = BowlingGame()
    }

    //Test1: Write test to check that an empty/default game returns zero score
    @Test
    fun testEmptyGame() {
        assertEquals(0, game.score)
    }

    //Test2: Write test to check a gutter game returns zero
    @Test
    fun testZeros() {
        val rolls = intArrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
        game.setRolls(rolls)
        assertEquals(0, game.score)
    }
}