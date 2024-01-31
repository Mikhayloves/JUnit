package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class createFileTest {

    @org.junit.jupiter.api.Test
    void createFile() {
    }

    @ParameterizedTest
    @CsvSource(value = {
            "C:\\Game\\src\\main,Main.java, true",
            "C:\\Game\\src\\main,Utils.java, true",
            "C:\\Game\\temp,temp.txt,true"

    })
    public void createFileParameterized(String way, String filename, boolean expected) {
        boolean result = Main.createFile(way, filename);
        Assertions.assertEquals(expected, result);
    }
}
