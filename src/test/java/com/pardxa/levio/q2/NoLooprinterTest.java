package com.pardxa.levio.q2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;

public class NoLooprinterTest {
    private ByteArrayOutputStream outputCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputCaptor));
    }

    @Test
    void printAll() {
        NoLooprinter.printAll(5);
        assertEquals("aaaaabbbbb", outputCaptor.toString().trim());
    }
}
