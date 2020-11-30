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
    @Test
    void getList() {
    }

    @DisplayName("addContact Test")
    @Test
    void addContact() {
    }

    @DisplayName("removeContact Test")
    @Test
    void removeContact() {
    }

    @DisplayName("consoleSearch Test")
    @Test
    void consoleSearch() {
    }
}