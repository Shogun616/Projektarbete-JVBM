package com.jvbm;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ContextTest {

    @BeforeAll
    public static void init(){
        System.out.println("Before All init() method called");
    }

    @AfterAll
    public static void cleanUp(){
        System.out.println("After All cleanUp() method called");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Before Each initEach() method called");
    }

    @AfterEach
    void tearDown() {
        System.out.println("After Each cleanUpEach() method called");
    }

    @DisplayName("getList Test")
    @RepeatedTest(5)
    void getList(RepetitionInfo repetitionInfo) {
        System.out.println("Running test -> " + repetitionInfo.getCurrentRepetition());
        assertNull(null);
    }

    @DisplayName("addContact Test")
    @RepeatedTest(5)
    void addContact(RepetitionInfo repetitionInfo) {
        System.out.println("Running test -> " + repetitionInfo.getCurrentRepetition());
        assertNull(null);
    }

    @DisplayName("removeContact Test")
    @RepeatedTest(5)
    void removeContact(RepetitionInfo repetitionInfo) {
        System.out.println("Running test -> " + repetitionInfo.getCurrentRepetition());
        assertNull(null);
    }

    @DisplayName("consoleSearch Test")
    @RepeatedTest(5)
    void consoleSearch(RepetitionInfo repetitionInfo) {
        System.out.println("Running test -> " + repetitionInfo.getCurrentRepetition());
        assertNull(null);
    }
}