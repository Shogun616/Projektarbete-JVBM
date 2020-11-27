package com.jvbm;

import org.junit.jupiter.api.*;

public class MenuTest {

    @BeforeAll
    public static void init(){
        System.out.println("Before All init() method called");
    }

    @BeforeEach
    public void initEach(){

        System.out.println("Before Each initEach() method called");
    }

    @DisplayName("options test")
    @Test
    void testOptions(){

    }

    @DisplayName("menu test")
    @Test
    void testMenu(){

    }

    @AfterEach
    public void cleanUpEach(){
        System.out.println("After Each cleanUpEach() method called");
    }


    @AfterAll
    public static void cleanUp(){
        System.out.println("After All cleanUp() method called");
    }
}
