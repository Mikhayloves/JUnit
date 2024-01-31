package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void createDirectory() {
        List<String> list = List.of("C:\\Game\\src",
                "C:\\Game\\res", "C:\\Game\\savegames",
                "C:\\Game\\temp",
                "C:\\Game\\src\\test", "C:\\Game\\src\\main",
                "C:\\Game\\res\\drawables",
                "C:\\Game\\res/vectors",
                "C:\\Game\\reicons");
        Assertions.assertFalse(list.contains("Games"));
    }
}