import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MainTest {

    Main main = null;
    @BeforeEach
    public void Setup() {
        main = new Main();
    }

    @Test
    public void testGetFirstSingle() {

        char actualResult = main.getFirstSingle("aabbccd");
        char expectedResult = 'd';

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
