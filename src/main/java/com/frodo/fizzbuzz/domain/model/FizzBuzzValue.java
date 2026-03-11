package com.frodo.fizzbuzz.domain.model;

/**
 * A domain value object representing the FizzBuzz transformation logic.
 * Encapsulates the core rules defined in the business requirements.
 */
public record FizzBuzzValue(String value) {
    public static FizzBuzzValue from(int number) {
        if (number % 15 == 0) return new FizzBuzzValue("FizzBuzz");
        if (number % 3 == 0) return new FizzBuzzValue("Fizz");
        if (number % 5 == 0) return new FizzBuzzValue("Buzz");
        return new FizzBuzzValue(String.valueOf(number));
    }
}