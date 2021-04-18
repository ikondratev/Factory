package application;

import animals.Animal;
import animals.Animals;
import factory.AnimalFactory;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello it's factory");

        AnimalFactory factory = new AnimalFactory();
        Animal fox = factory.createAnimal(Animals.FOX);

        System.out.print("Animal say: ");
        fox.vote();
    }
}
