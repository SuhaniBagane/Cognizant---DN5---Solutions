import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    StringUtils utils = new StringUtils();

    @Test
    void testReverse(){

        assertEquals("avaJ", utils.reverse("Java"));

    }

    @Disabled("Disabled for demonstration")
    @Test
    void disabledTest(){

        fail("This test is disabled");

    }

}