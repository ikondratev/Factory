package factory;

import animals.Animal;
import animals.Animals;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class AnimalFactoryTest extends TestCase {
    public AnimalFactory factory;

    @Before
    public void preset() {
        factory = new AnimalFactory();
    }

    @Test
    public void getFox() {
        Animal fox = factory.createAnimal(Animals.FOX);
        assertEquals("class animals.Fox", fox.getClass().toString());
    }

    @Test
    public void getWolf() {
        Animal wolf = factory.createAnimal(Animals.WOLF);
        assertEquals("class animals.Wolf", wolf.getClass().toString());
    }

    @Test
    public void getRabbit() {
        Animal rabbit = factory.createAnimal(Animals.RABBIT);
        assertEquals("class animals.Rabbit", rabbit.getClass().toString());
    }
}