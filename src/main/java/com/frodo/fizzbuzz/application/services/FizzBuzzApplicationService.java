package com.frodo.fizzbuzz.application.services;

import com.frodo.fizzbuzz.application.ports.in.FizzBuzzUseCasePort;
import com.frodo.fizzbuzz.application.ports.out.FizzBuzzReporterPort;
import com.frodo.fizzbuzz.domain.model.FizzBuzzValue;

public class FizzBuzzApplicationService implements FizzBuzzUseCasePort {
    private final FizzBuzzReporterPort reporter;

    public FizzBuzzApplicationService(FizzBuzzReporterPort outputPort) {
        this.reporter = outputPort;
    }

    @Override
    public void execute(int limit) {
        for (int i = 1; i <= limit; i++) {
            String result = FizzBuzzValue.from(i).value();
            reporter.present(result);
        }
    }
}