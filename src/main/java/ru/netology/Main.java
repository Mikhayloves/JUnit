package ru.netology;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {

    static StringBuilder stringBuilder = new StringBuilder();

    public static void main(String[] args) throws IOException {
        List<String> directories = List.of("C:\\Game\\src",
                "C:\\Game\\res","C:\\Game\\savegames",
                "C:\\Game\\temp",
                "C:\\Game\\src\\test","C:\\Game\\src\\main",
                "C:\\Game\\res\\drawables",
                "C:\\Game\\res/vectors",
                "C:\\Game\\reicons");
        for (int i = 0; i < directories.size(); i++) {
            createDirectory(directories.get(i));
        }
        createFile("C:\\Game\\src\\main","Main.java");
        createFile("C:\\Game\\src\\main","Utils.java");
        createFile("C:\\Game\\temp","temp.txt");

        try {
            FileWriter writer = new FileWriter("C:\\Game\\temp\\temp.txt",false);
            writer.write(String.valueOf(stringBuilder));
            writer.flush();
            writer.close();
        } catch (IOException exx){
            System.out.println(exx.getMessage());
        }
    }
    static boolean createDirectory(String path) {
        File file = new File(path);
        if (file.mkdir()) {
            stringBuilder.append("Директория " + path + " создана\n");
        } else {
            stringBuilder.append("Директория " + path + " не создана\n");
        }
        return false;
    }

    static boolean createFile(String path, String fileName) {
        File file1 = new File(path+fileName);
        try {
            if (file1.createNewFile()) {
                stringBuilder.append("В директории " + path + " файл с именем " + fileName + " создан\n");
            }else {
                stringBuilder.append("В директории " + path + " файл с именем " + fileName + " не создан\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        return false;
    }
}
