package com.frodo.fizzbuzz.infrastructure.output;

import com.frodo.fizzbuzz.application.ports.out.FizzBuzzReporterPort;

/**
 * Driven adapter used for presenting
 */
public class ConsolePrinter implements FizzBuzzReporterPort {
    @Override
    public void present(String result) {
        System.out.println(result);
    }
}
