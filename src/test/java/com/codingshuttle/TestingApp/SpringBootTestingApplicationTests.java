package com.codingshuttle.TestingApp;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
@SpringBootTest
class SpringBootTestingApplicationTests {

    // Runs only once before all test cases
    @BeforeAll
    static void beforeAllTestCases() {
        log.info("========== Before All Test Cases ==========");
    }

    // Runs before every test case
    @BeforeEach
    void beforeEachTestCase() {
        log.info("------ Before Each Test Case ------");
    }

    // Method to test
    int addTwoNumber(int a, int b) {
        return a + b;
    }

    // Test Case 1
    @Test
    @DisplayName("Test Case 1 : Verify First Test")
    void testNumberOne() {
        log.info("Executing Test Case 1");
    }

    // Test Case 2
    @Test
    @DisplayName("Test Case 2 : Verify Second Test")
    void testNumberTwo() {
        log.info("Executing Test Case 2");
    }

    // Test Case 3
    @Test
    @DisplayName("Test Case 3 : Verify Addition of Two Numbers")
    void testAddTwoNumber() {

        int a = 10;
        int b = 20;
        int expected = 30;

        int actual = addTwoNumber(a, b);

        assertThat(actual).isEqualTo(expected);

        log.info("Addition Test Passed");
    }

    // Test Case 4
    @Test
    @DisplayName("Test Case 4 : String Assertions Using AssertJ")
    void testStringAssertions() {

        String fruit = "Apple";

        // 1. Check equality
        assertThat(fruit).isEqualTo("Apple");

        // 2. Check starts with
        assertThat(fruit).startsWith("App");

        // 3. Check ends with
        assertThat(fruit).endsWith("ple");

        // 4. Check contains
        assertThat(fruit).contains("pp");

        // 5. Check string length
        assertThat(fruit).hasSize(5);

        log.info("All String Assertions Passed");
    }

    // Runs after every test case
    @AfterEach
    void afterEachTestCase() {
        log.info("------ After Each Test Case ------");
    }

    // Runs only once after all test cases
    @AfterAll
    static void afterAllTestCases() {
        log.info("========== After All Test Cases ==========");
    }
}