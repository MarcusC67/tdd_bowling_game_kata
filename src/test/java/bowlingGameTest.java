
import static org.junit.Assert.assertEquals;
import org.junit.Ignore;
import org.junit.Test;

public class bowlingGameTest {

    @Test
    public void checkRollLessThan10() {
        // Arrange
        // Act
        bowlingGame game = new bowlingGame();
        // Assert
        assertEquals(5, game.roll(5));
    }

    @Test
    public void checkGameAllMisses() {
        bowlingGame game = new bowlingGame();
        for (int i = 0; i < 20; i++) {
            game.roll(0);
        }
        assertEquals(0, game.score());
    }

    @Test
    public void checkGameAllOnes() {
        bowlingGame game = new bowlingGame();
        for (int i = 0; i < 20; i++) {
            game.roll(1);
        }
        assertEquals(20, game.score());
    }

}
