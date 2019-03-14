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
}