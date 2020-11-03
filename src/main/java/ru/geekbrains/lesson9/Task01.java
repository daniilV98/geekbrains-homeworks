package ru.geekbrains.lesson9;

import java.io.*;

public class Task01 {

    public static void main(String[] args) {
        File file = new File("demo.txt");
        try {
            FileInputStream fileSt = new FileInputStream(file);
            byte[] byteArray = new byte[(int)file.length()];
            fileSt.read(byteArray);
            String data = new String(byteArray);
            System.out.println("Количество символов в строке: " + data.length());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
