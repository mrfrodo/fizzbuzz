package com.frodo.fizzbuzz.infrastructure.cli;

import com.frodo.fizzbuzz.application.ports.in.FizzBuzzUseCasePort;
import com.frodo.fizzbuzz.application.ports.out.FizzBuzzReporterPort;
import com.frodo.fizzbuzz.application.services.FizzBuzzApplicationService;
import com.frodo.fizzbuzz.infrastructure.output.ConsolePrinter;

/**
 * Driver adapter used for initiating the fizzbuzz
 */
public class Main {
    public static void main(String[] args) {

        // Set up the output port for presenting (the driven adapter)
        FizzBuzzReporterPort presenter = new ConsolePrinter();

        // Initialize the fizzbuzz service
        FizzBuzzUseCasePort app = new FizzBuzzApplicationService(presenter);

        // Drive and execute
        app.execute(200);
    }
}
