package ui;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class MenuTest {

    @Test
    void verifyInputMismatchExceptionIsThrown() {

        //Menu ui = new Menu();
        String input = "bad input";

        // Här fejkar vi användarinput genom att ändra inputstream från konsolen till variabeln input ovan
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertThrows(NoSuchElementException.class, () -> {
            Menu.readInteger();
        });

    }


}

//    @BeforeAll
//    public static void init(){
//        System.out.println("Before All init() method called");
//    }
//
//    @AfterAll
//    public static void cleanUp(){
//        System.out.println("After All cleanUp() method called");
//    }
//
//    @BeforeEach
//    void setUp() {
//        System.out.println("Before Each initEach() method called");
//    }
//
//    @AfterEach
//    void tearDown() {
//        System.out.println("After Each cleanUpEach() method called");
//    }
//
//    @DisplayName("Options Test")
//    @RepeatedTest(5)
//    void options(RepetitionInfo repetitionInfo) {
//        System.out.println("Running test -> " + repetitionInfo.getCurrentRepetition());
//        assertTrue(Menu.repeat);
//        assertTrue(true, "OK");
//        assertNull(null);
//    }
//
//    @DisplayName("mainMenu Test")
//    @RepeatedTest(5)
//    void mainMenu(RepetitionInfo repetitionInfo) {
//        System.out.println("Running test -> " + repetitionInfo.getCurrentRepetition());
//        assertEquals(Menu.scan, Menu.scan);
//        assertNull(null);
//    }
//
//    @DisplayName("main Test")
//    @RepeatedTest(5)
//    void main(RepetitionInfo repetitionInfo) {
//        System.out.println("Running test -> " + repetitionInfo.getCurrentRepetition());
//        assertTrue(Menu.repeat);
//        assertNull(null);
//    }



