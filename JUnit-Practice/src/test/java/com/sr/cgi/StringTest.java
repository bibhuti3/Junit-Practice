package com.sr.cgi;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;


import static org.junit.jupiter.api.Assertions.*;

class StringManipulationTests {



    @Test
    void givenNullStringThenReturnZeroVowelCount(){
        assertEquals(0,StringManipulation.vowelCount(null));
    }

    @Test
    void givenEmptyStringThenReturnZeroVowelCount(){
        assertEquals(0,StringManipulation.vowelCount(""));
    }

    @Test
    void givenStringThenReturnVowelCount(){
        assertEquals(4,StringManipulation.vowelCount("aiouzxxvv"));
    }

    @Test
    void givenNoVowelStringThenReturnZeroVowelCount(){
        assertEquals(0,StringManipulation.vowelCount("nnnghfdrt"));
    }

    @Test
    void givenAllVowelStringThenReturnVowelCount(){
        assertEquals(6,StringManipulation.vowelCount("aeiAEIkjhsh"));
    }


    @Test
    void givenNullStringThenReturnZeroCharacterCount(){
        assertEquals(0,StringManipulation.characterCount(null));
    }

    @Test
    void givenEmptyStringThenReturnZeroCharacterCount(){
        assertEquals(0,StringManipulation.characterCount(""));
    }

    @Test
    void givenStringThenReturnCharacterCount(){
        assertEquals(10,StringManipulation.characterCount("ddffdddffd"));
    }

    @Test
    void givenStringWithSpacesOnlyThenReturnZeroCharacterCount(){
        assertEquals(0,StringManipulation.characterCount("       "));
    }
    @ParameterizedTest
    @CsvSource({"4,aiouzxxvv","0,nnnghfdrt","6,aeiAEIkjhsh"})
    void givenInputStringThenReturnVowelCount(int count, String input){
        assertEquals(count,StringManipulation.vowelCount(input));
    }

    @ParameterizedTest
    @NullAndEmptySource
    void givenNullAndEmptyStringThenReturnZeroVowelCount(String input){
        assertEquals(0,StringManipulation.vowelCount(input));
    }

//    Character Count Tests

    @ParameterizedTest
    @CsvSource({"10,ddffdddffd", "8,bibhutib", "0,     "})
    void givenInputStringThenReturnCharacterCount(int count, String input){
        assertEquals(count,StringManipulation.characterCount(input));
    }

    @ParameterizedTest
    @NullAndEmptySource
    void givenNullAndEmptyStringThenReturnZeroCharacterCount(String input){
        assertEquals(0,StringManipulation.characterCount(input));
    }

}