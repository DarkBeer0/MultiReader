package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class FileManager {
    public static String path = "C:\\Users\\bapho\\Downloads\\jar(y)\\freetts-1.2\\lib\\README.txt";

    public boolean CheckFile() {
        return new File(path).exists();
    }

    public String GetFileText() {
        StringBuilder content = new StringBuilder();
        File file = new File(path);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        catch (Exception e) {
            //todo
        }

        return content.toString();
    }
}
