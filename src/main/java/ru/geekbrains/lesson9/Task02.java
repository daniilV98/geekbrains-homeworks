package ru.geekbrains.lesson9;

import java.io.*;
import java.util.ArrayList;

public class Task02 {

    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        try {
            BufferedReader bfReader = new BufferedReader(new FileReader( "demo.txt"));
            String s1;
            while ((s1 = bfReader.readLine()) != null) {
                list.add(s1);
            }
            BufferedReader bfReader2 = new BufferedReader(new FileReader( "text.txt"));
            String s2;
            while((s2 = bfReader2.readLine()) != null) {
                list.add(s2);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        BufferedWriter bfWriter = new BufferedWriter(new FileWriter("mixed.txt"));
        String listWord;
        for (int i = 0; i< list.size(); i++) {
            listWord = list.get(i);
            bfWriter.write(listWord);
            bfWriter.write("\n");
            System.out.println(listWord);
        }
        System.out.println("Успешное объединение!");
        bfWriter.close();
    }
}
