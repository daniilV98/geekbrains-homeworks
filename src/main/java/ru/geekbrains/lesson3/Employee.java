package ru.geekbrains.lesson3;

public class Employee {

    private String name;
    private String email;
    private int age;
    private String position;

    public Employee(String name, String email, int age, String position) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                '}';
    }
}
