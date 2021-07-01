package com.sr.cgi;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.*;

public class AppTest 
{

    @Test
    public void shouldAnswerWithTrueForaddWum()
    {      int res = App.addWum(8,9);
        assertEquals( 17,res );
    }
    @Test
    public void shouldAnswerWithFalseForaddWum(){
        int res = App.addWum(8,5);
        assertNotEquals(8, res);
    }
    @Test
    public void shouldAnswerWithTrueForisEven()
    {    boolean res = App.isEven(118);
        assertTrue(res);
    }
    @Test
    public void shouldAnswerWithFalseForisEven(){
        boolean res = App.isEven(9);
        assertFalse(res);
    }
    @ParameterizedTest
    @CsvSource({"5,4,9","4,1,5","0,0,0","1,-1,0"})
    void givenIntegersThenCheckSum(int a, int b, int sum){
        assertEquals(sum,App.addWum(a,b));
    }

    @ParameterizedTest
    @ValueSource(ints = {0,46,82,72})
    void givenEvenIntegerThenReturnTrue(int ints){
        assertTrue(App.isEven(ints));
    }

    @ParameterizedTest
    @ValueSource(ints = {1,119,15,33})
    void givenOddIntegersThenReturnFalse(int ints){
        assertFalse(App.isEven(ints));
    }

}
