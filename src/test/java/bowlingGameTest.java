import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class bowlingGameTest {

    @Test
    public void checkRollLessThan10() {
        // Arrange
        // Act
        bowlingGame game = new bowlingGame();
        // Assert
        assertEquals(5, game.rollLessThan10(5));
    }

}
