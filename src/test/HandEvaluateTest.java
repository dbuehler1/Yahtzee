package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static edu.wctc.handEvaluater.*;

public class HandEvaluateTest {
    @Test
    void FullHouse(){assertEquals("Full House!", determineResult(new String[]{"1", "1", "2", "2", "2"}));}

}
