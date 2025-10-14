package org.example;

import org.example.task1.Animal;
import org.example.task1.Cat;
import org.example.task1.Dog;
import org.example.task4.Car;

public class Main {
    public static void main(String[] args) {
        // task 1
        Animal cat = new Cat("cat");
        Animal dog = new Dog("babaca");

        System.out.println(cat.makeSound());
        System.out.println(dog.makeSound());

        // task 4
        Car mcqueen = new Car(50000, 2006, 700);
        Car mater = new Car(50000, 2005, 500);

        int result = mcqueen.compareTo(mater);

        if (result > 0) {
            System.out.println("McQueen");
        } else if (result < 0) {
            System.out.println("Mater");
        } else {
            System.out.println("Рівні");
        }
    }
}
