import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class PerformanceTesterTest {

    PerformanceTester tester = new PerformanceTester();

    @Test
    void timeoutTest(){

        assertTimeout(Duration.ofSeconds(1),()->{

            tester.executeTask();

        });

    }

}