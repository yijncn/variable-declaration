package com.jirengu;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimitiveDataTypesPracticeTest {

    @Test
    public void testPrintPrimitiveDataTypes() {
        // 保存标准输出流的引用
        PrintStream originalOut = System.out;

        try {
            // Arrange
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PrintStream printStream = new PrintStream(outputStream);

            System.setOut(printStream);

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
        } finally {
            // 恢复标准输出流
            System.setOut(originalOut);
        }
    }
}
