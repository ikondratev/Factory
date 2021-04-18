package factory;

import animals.*;


public class AnimalFactory {
    public Animal createAnimal(Animals kind){
        Animal result = null;
        switch (kind) {
            case FOX:    result = new Fox(); break;
            case WOLF:   result = new Wolf(); break;
            case RABBIT: result = new Rabbit(); break;
        }

        return result;
    }
}
