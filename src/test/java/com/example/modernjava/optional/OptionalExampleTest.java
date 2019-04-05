package com.example.modernjava.optional;

import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

import static com.example.modernjava.optional.OptionalExample.multiplyInteger;
import static com.example.modernjava.optional.OptionalExample.powIfEvenNumber;

public class OptionalExampleTest {

    @Test
    public void multiplyIntegerTest() {
        Assert.assertEquals(1, (int) multiplyInteger(1));
        Assert.assertEquals(4, (int) multiplyInteger(2));
    }
    @Test
    public void multiplyIntegerWhenNullTest() {
        Assert.assertEquals(0, (int) multiplyInteger(null));
    }

    @Test
    public void powIfEvenNumberTest() {
        Assert.assertEquals(Optional.of(4.0), powIfEvenNumber(2));
        Assert.assertEquals(Optional.of(256.0), powIfEvenNumber(4));
    }

    @Test
    public void powWhenNotEvenTest() {
        Assert.assertEquals(Optional.empty(), powIfEvenNumber(1));
        Assert.assertEquals(Optional.empty(), powIfEvenNumber(3));
        Assert.assertEquals(Optional.empty(), powIfEvenNumber(11));
    }

    @Test
    public void powWhenNullTest() {
        Assert.assertEquals(Optional.empty(), powIfEvenNumber(null));
    }
}