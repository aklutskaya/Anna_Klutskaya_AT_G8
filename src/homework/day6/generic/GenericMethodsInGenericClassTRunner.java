package homework.day6.generic;

import homework.day4.playground.essence.craft.field.Vehicle;
import homework.day4.playground.essence.creatures.Crocodile;
import homework.day4.playground.essence.creatures.Fly;

public class GenericMethodsInGenericClassTRunner {
    public static void main(String[] args) {

        GenericMethodsInGenericClassT<String> stringObject = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Integer> integerObject = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Double> doubleObject = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Crocodile> crocodile = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Fly> fly = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Vehicle> vehicle = new GenericMethodsInGenericClassT<>();

        String str = "Мама мыла раму";
        stringObject.genericMethodHalfGenArgs(" ", str);
        stringObject.genericMethodOneGenArg("Hello");
        integerObject.genericMethodOneGenArg(54);
        doubleObject.genericMethodOneGenArg(34.65);
        crocodile.genericMethodOneGenArg(new Crocodile(98, "Gena"));
        System.out.println(fly.genericMethodTwoGenArgs(new Fly(87, "Kate"), new Fly(87, "Lopa")));
        vehicle.genericMethodOneGenArg(new Vehicle(98, "Roga") {
            @Override
            public void drive(String direction) {
            }

            @Override
            public int move(int pointA, int pointB) {
                return 0;
            }
        });

    }

}
