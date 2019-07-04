package com.thoughtworks.tdd;

import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    private static FizzBuzz fizzBuzz;

    @BeforeAll
    private static void setUp(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void testFizzBuzz1() {
        String result = fizzBuzz.fizzBuzz(1);
        MatcherAssert.assertThat(result, Is.is("1"));
    }

    @Test
    void testFizzBuzz2() {
        String result = fizzBuzz.fizzBuzz(3);
        MatcherAssert.assertThat(result,Is.is("Fizz"));
    }

    @Test
    void testFizzBuzz3() {
        String result = fizzBuzz.fizzBuzz(5);
        MatcherAssert.assertThat(result,Is.is("Buzz"));
    }

    @Test
    void testFizzBuzz4() {
        String result = fizzBuzz.fizzBuzz(7);
        MatcherAssert.assertThat(result, Is.is("Whizz"));
    }

    @Test
    void testFizzBuzz5() {
        String result = fizzBuzz.fizzBuzz(15);
        MatcherAssert.assertThat(result,Is.is("FizzBuzz"));
    }

    @Test
    void testFizzBuzz6() {
        String result = fizzBuzz.fizzBuzz(105);
        MatcherAssert.assertThat(result,Is.is("FizzBuzzWhizz"));
    }
}
