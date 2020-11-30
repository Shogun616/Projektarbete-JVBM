package com.jvbm;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MenuTest {

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

    @DisplayName("Options Test")
    @RepeatedTest(5)
    void options(RepetitionInfo repetitionInfo) {
        System.out.println("Running test -> " + repetitionInfo.getCurrentRepetition());
        assertTrue(Menu.repeat);
        assertTrue(true, "OK");
        assertNull(null);
    }

    @DisplayName("mainMenu Test")
    @RepeatedTest(5)
    void mainMenu(RepetitionInfo repetitionInfo) {
        System.out.println("Running test -> " + repetitionInfo.getCurrentRepetition());
        assertEquals(Menu.scan, Menu.scan);
        assertNull(null);
    }

    @DisplayName("main Test")
    @RepeatedTest(5)
    void main(RepetitionInfo repetitionInfo) {
        System.out.println("Running test -> " + repetitionInfo.getCurrentRepetition());
        assertTrue(Menu.repeat);
        assertNull(null);
    }
}