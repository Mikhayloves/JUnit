package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CreateDirectoryTest {

    @org.junit.jupiter.api.Test
    void createDirectory() {
    }

     @ParameterizedTest
    @ValueSource(strings = {"C:\\Game\\src",
            "C:\\Game\\res", "C:\\Game\\savegames",
            "C:\\Game\\temp",
            "C:\\Game\\src\\test", "C:\\Game\\src\\main",
            "C:\\Game\\res\\drawables",
            "C:\\Game\\res/vectors",
            "C:\\Game\\reicons"
            })
    public void createDirectoryParameterized(String path){
         boolean result = Main.createDirectory(path);
         Assertions.assertTrue(result);
     }

}