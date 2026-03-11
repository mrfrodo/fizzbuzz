package com.frodo.fizzbuzz.application;

import com.frodo.fizzbuzz.application.services.FizzBuzzApplicationService;
import com.frodo.fizzbuzz.infrastructure.SpyReporter;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzServiceTest {

    @Test
    void should_present_fizz_buzz_sequence_up_to_three() {
        // 1. Arrange: Setup the Spy and the Service
        SpyReporter spy = new SpyReporter();
        FizzBuzzApplicationService service = new FizzBuzzApplicationService(spy);

        // 2. Act: Execute the service logic
        service.execute(3);

        // 3. Assert: Verify the interaction
        List<String> results = spy.getCapturedResults();

        assertEquals(3, results.size(), "Should have exactly 3 results");
        assertEquals("1", results.get(0));
        assertEquals("2", results.get(1));
        assertEquals("Fizz", results.get(2));
    }
}