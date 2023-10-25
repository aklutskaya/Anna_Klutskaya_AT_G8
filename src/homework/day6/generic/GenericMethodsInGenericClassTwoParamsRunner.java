package homework.day6.generic;

import homework.day4.playground.essence.craft.air.Copter;
import homework.day4.playground.essence.craft.air.Plane;
import homework.day4.playground.essence.craft.field.Car;
import homework.day4.playground.essence.craft.field.Motorbike;
import homework.day4.playground.essence.creatures.Crocodile;
import homework.day4.playground.essence.creatures.Fly;

public class GenericMethodsInGenericClassTwoParamsRunner {

    public static void main(String[] args) {
        GenericMethodsInGenericClassTwoParams<String, String> strObj = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<String, Integer> strIntObj = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<String, Double> doubleObj = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Integer, Integer> intObj = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Crocodile, Fly> crocObj = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Copter, Plane> copterObj = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Car, Motorbike> carObj = new GenericMethodsInGenericClassTwoParams<>();

        System.out.println(strObj.genericMethodGenArgs("Hello", "Java"));
        System.out.println(strIntObj.genericMethodGenArgs("Hello", 50));
        System.out.println(doubleObj.genericMethodGenArgs("Hello", 23.43));
        System.out.println(intObj.genericMethodGenArgs(56, 43));
        strObj.genericMethodHalfGenArgs("hello", "java");
        strIntObj.genericMethodHalfGenArgs("hello", 65, "java");
        doubleObj.genericMethodHalfGenArgs("hello", 87.65, "java");
        intObj.genericMethodHalfGenArgs(65, 34, "java");
        System.out.println(crocObj.genericMethodGenArgs(new Crocodile(87, "Gena"), new Fly(34, "Fly")));
        System.out.println(copterObj.genericMethodGenArgs(new Copter(65, "Copter"), new Plane(74, "Plane")));
        System.out.println(carObj.genericMethodGenArgs(new Car(345, "car"), new Motorbike(23, "Motor")));
    }
}
