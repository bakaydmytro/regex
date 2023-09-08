package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ValidationServiceTest {

    ValidationService validationService;

    @Before
    public void setUp(){
        validationService = new ValidationService();
    }


    @Test
    public void invalidLongStringTest(){
        boolean result = validationService.valid("Ab1_asdahxc", 5);
        Assert.assertFalse(result);
    }

    @Test
    public void invalidEmptyStringTest(){
        boolean result = validationService.valid("", 5);
        Assert.assertFalse(result);
    }

    @Test
    public void validStringTest(){
        boolean result = validationService.valid("Ab1_", 5);
        Assert.assertTrue(result);
    }

    @Test
    public void invalidMissingUppercaseTest(){
        boolean result = validationService.valid("ab1_", 5);
        Assert.assertFalse(result);
    }

    @Test
    public void invalidMissingLowercaseTest(){
        boolean result = validationService.valid("AB1_", 5);
        Assert.assertFalse(result);
    }

    @Test
    public void invalidMissingSpecialCharacterTest(){
        boolean result = validationService.valid("AB1", 5);
        Assert.assertFalse(result);
    }

    @Test
    public void invalidMissingDigitTest(){
        boolean result = validationService.valid("Aa_", 5);
        Assert.assertFalse(result);
    }

    @Test
    public void invalidContainsWhitespaceTest(){
        boolean result = validationService.valid("Aa 1_", 5);
        Assert.assertFalse(result);
    }

    @Test
    public void invalidContainsNewLinesTest(){
        boolean result = validationService.valid("Aa\n1_", 5);
        Assert.assertFalse(result);
    }

    @Test
    public void invalidNullTest(){
        boolean result = validationService.valid(null, 5);
        Assert.assertFalse(result);
    }

}
