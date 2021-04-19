package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static edu.wctc.handEvaluater.*;

public class HandEvaluateTest {
    @Test
    void FullHouse(){assertEquals("Full House!", determineResult(new String[]{"1", "1", "2", "2", "2"}));}
    @Test
    void FullHouse2(){assertEquals("Full House!", determineResult(new String[]{"5", "5", "5", "2", "2"}));}
    @Test
    void FullHouse3(){assertEquals("Full House!", determineResult(new String[]{"4", "1", "4", "1", "1"}));}
    @Test
    void Yahtzee(){assertEquals("Yahtzee!", determineResult(new String[]{"2", "2", "2", "2", "2"}));}
    @Test
    void Yahtzee2(){assertEquals("Yahtzee!", determineResult(new String[]{"4", "4", "4", "4", "4"}));}
    @Test
    void Yahtzee3(){assertEquals("Yahtzee!", determineResult(new String[]{"5", "5", "5", "5", "5"}));}
    @Test
    void ThreeofaKind(){assertEquals("Three of a Kind!", determineResult(new String[]{"3", "1", "2", "2", "2"}));}
    @Test
    void ThreeofaKind2(){assertEquals("Three of a Kind!", determineResult(new String[]{"3", "1", "3", "3", "2"}));}
    @Test
    void ThreeofaKind3(){assertEquals("Three of a Kind!", determineResult(new String[]{"4", "1", "1", "1", "2"}));}
    @Test
    void TwoPair(){assertEquals("Two Pair!", determineResult(new String[]{"1", "1", "2", "2", "3"}));}
    @Test
    void TwoPair2(){assertEquals("Two Pair!", determineResult(new String[]{"4", "4", "2", "3", "3"}));}
    @Test
    void TwoPair3(){assertEquals("Two Pair!", determineResult(new String[]{"2", "4", "2", "5", "5"}));}
    @Test
    void Pair(){assertEquals("Pair!", determineResult(new String[]{"6", "6", "2", "3", "5"}));}
    @Test
    void Pair2(){assertEquals("Pair!", determineResult(new String[]{"5", "6", "2", "3", "5"}));}
    @Test
    void Pair3(){assertEquals("Pair!", determineResult(new String[]{"1", "6", "2", "2", "5"}));}
    @Test
    void OneofaKind(){assertEquals("One of a Kind!", determineResult(new String[]{"1", "2", "4", "3", "5"}));}
    @Test
    void OneofaKind2(){assertEquals("One of a Kind!", determineResult(new String[]{"5", "2", "3", "4", "6"}));}
    @Test
    void OneofaKind3(){assertEquals("One of a Kind!", determineResult(new String[]{"4", "1", "3", "2", "6"}));}
}
