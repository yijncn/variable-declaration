package com.jirengu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimitiveDataTypesPracticeTest {
    PrintStream originalOut;
    ByteArrayOutputStream outputStream;

    @BeforeEach
    public void setup() {
        originalOut = System.out;
        outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
    }

    @AfterEach
    public void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    public void testPrintPrimitiveDataTypes() {
        // Act
        PrimitiveDataTypesPractice.main(null);

        // Assert
        String output = outputStream.toString().trim();
        assertEquals("Age is: 10\n" +
                "Height is: 30000\n" +
                "Num is: 1000000000\n" +
                "Distance is: 10000000000\n" +
                "Rate is: 1.2\n" +
                "Fixed rate is: 3.707317073170732\n" +
                "Ch: A\n" +
                "isUpdated: true", output);

    }
}
