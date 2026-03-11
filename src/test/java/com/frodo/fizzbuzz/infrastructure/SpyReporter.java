package com.frodo.fizzbuzz.infrastructure;

import com.frodo.fizzbuzz.application.ports.out.FizzBuzzReporterPort;
import java.util.ArrayList;
import java.util.List;

public class SpyReporter implements FizzBuzzReporterPort {
    private final List<String> capturedResults = new ArrayList<>();

    @Override
    public void present(String result) {
        capturedResults.add(result);
    }

    public List<String> getCapturedResults() {
        return capturedResults;
    }
}