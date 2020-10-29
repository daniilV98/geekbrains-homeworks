package ru.geekbrains.lesson8.task2;

import java.util.ArrayList;
import java.util.HashMap;

public class Notebook {

    private String lastName;
    private String phoneNumber;

    HashMap<String, ArrayList<String>> notebook = new HashMap<>();

    public void addEntries(String lastName, String phoneNumber) {
        ArrayList<String> numberList = notebook.get(lastName);
        if (numberList == null) {
            numberList = new ArrayList<>();
        }
        numberList.add(phoneNumber);
        notebook.put(lastName, numberList);
    }

    public ArrayList<String> getLastName(String lastName) {
        return notebook.get(lastName);
    }
}
