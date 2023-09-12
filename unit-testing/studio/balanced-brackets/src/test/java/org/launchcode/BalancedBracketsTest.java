package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void oneBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void doesNotHaveBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void bracketContainsAStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launchcode]"));
    }

    @Test
    public void bracketContainsNumbersReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[1234]"));
    }

    @Test
    public void bracketsWithStringOutsideReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]Launchcode"));
    }

    @Test
    public void bracketWithStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launchcode"));
    }

    @Test
    public void stringWithBracketsInMiddleOfStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void mismatchBracketWithStringReturnsFalse () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]code["));
    }

    @Test
    public void backwardsBracketsReturnsFalse () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void hasNoBracketsWithStringReturnsTrue () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("TestString"));
    }

    @Test
    public void hasNoBracketsWithNumbersReturnsTrue () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("1234"));
    }

    @Test
    public void bracketsWithSpecialCharactersReturnsTrue () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[@#]"));
    }

    @Test
    public void bracketsWithStringAndSpecialCharacterReturnsTrue () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[@LaunchCode!!]"));
    }

    @Test
    public void mismatchBracketsWithSpecialCharactersReturnsFalse () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]@Launch["));
    }

    @Test
    public void ets(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch[]][Code"));
    }

}
