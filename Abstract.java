public class Abstract {
    public static void main(String[] args) {
        Horse myHorse = new Horse();
        myHorse.eat();
        myHorse.walk();
        System.out.println(myHorse.color);

        Chicken myChicken = new Chicken();
        myChicken.eat();
        myChicken.walk();
    }
}

abstract class Animal {

    String color;

    Animal() {
        color = "brown";
    }

    void eat() {
        System.out.println("animal eats...");
    }

    abstract void walk();
}

class Horse extends Animal {

    void changeColor() {
        color = "dark brown";
    }

    void walk() {
        System.out.println("walks on 4 legs...");
    }
}

class Chicken extends Animal {

    void changeColor() {
        color = "yellow";
    }

    void walk() {
        System.out.println("walks on 2 legs...");
    }
}
