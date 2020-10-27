package ru.geekbrains.lesson7;

public class Main {

    public static void main(String[] args) {

        Apple apple1 = new Apple();
        Orange orange1 = new Orange();

        /** Вывод веса одного фрукта
         * */
        System.out.println("Вес одного яблока: = " + apple1.getWeight());
        System.out.println("Вес одного апельсина: = " + orange1.getWeight());
        System.out.println();

        /** Добавление фруктов в коробки и вывод их общего веса
         * */
        Box<Apple> appleBox1 = new Box<Apple>(apple1);
        for (int i = 0; i < 45; i++) {
            appleBox1.addFruitToBox(new Apple());
        }
        System.out.println("Общий вес коробки 'appleBox1' с яблоками: = " + appleBox1.getWeight());

        Box<Apple> appleBox2 = new Box<Apple>(apple1);
        for (int i = 0; i < 50; i++) {
            appleBox2.addFruitToBox(new Apple());
        }
        /**тест на добавление по одному яблоку
         * */
        appleBox2.addFruitToBox(apple1);
        System.out.println("Общий вес коробки 'appleBox2' с яблоками: = " + appleBox2.getWeight());
        System.out.println();

        Box<Orange> orangeBox1 = new Box<Orange>(orange1);
        for (int i = 0; i < 20; i++) {
            orangeBox1.addFruitToBox(new Orange());
        }
        System.out.println("Общий вес коробки 'orangeBox1' с апельсинами: = " + orangeBox1.getWeight());

        Box<Orange> orangeBox2 = new Box<Orange>(orange1);
        for (int i = 0; i < 30; i++) {
            orangeBox2.addFruitToBox(new Orange());
        }
        System.out.println("Общий вес коробки 'orangeBox2' с апельсинами: = " + orangeBox2.getWeight());
        System.out.println();

        /** Тест метода 'compare', который сравнивает массу коробок между собой
         * */
        System.out.println("Равняется ли вес коробок яблока 'appleBox1' и апельсина 'orangeBox2'? : " + appleBox1.compare(orangeBox2));
        System.out.println();

        /** Тест метода по пересыпке фрутов из одной коробки в другую
         * */
        Box<Orange> orangeBox3 = new Box<Orange>(orange1);
        orangeBox1.moveFruitFromBoxToBox(orangeBox3);
        System.out.println("Общий вес коробки 'orangeBox1' с апельсинами, после того, как высыпали из неё: = " + orangeBox1.getWeight());
        System.out.println("Общий вес коробки 'orangeBox3' с апельсинами, после того, как насыпали в неё: = " + orangeBox3.getWeight());
    }
}
