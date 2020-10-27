package ru.geekbrains.lesson7;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    public List<T> boxWithFruit;

    public List<T> getBoxWithFruit() {
        return boxWithFruit;
    }

    public Box(T fruitList) {
        this.boxWithFruit = new ArrayList<T>();
    }

    public float getWeight() {
        if (boxWithFruit.size() == 0) return 0;
        float weight = 0;
        for (T item: boxWithFruit) weight += item.getWeight();
        return weight;
    }

    public boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }

    public void addFruitToBox(T fruit) {
        boxWithFruit.add(fruit);
    }

    public Box<? super T> moveFruitFromBoxToBox(Box<? super T> box) {
        box.boxWithFruit.addAll(this.boxWithFruit);
        boxWithFruit.clear();
        return box;
    }
}
