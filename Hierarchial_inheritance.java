public class Hierarchial_inheritance {
    public static void main(String[] args) {
        Bird parrot = new Bird();
        parrot.fly();
    }
}

// base class
class Animal {
    String color;

    void eat() {
        System.out.println("Eating...");
    }

    void breathe() {
        System.out.println("Breathing...");
    }
}

// derived class
class Mammal extends Animal {
    void walk() {
        System.out.println("Walking...");
    }
}

// derived class
class Fish extends Animal {
    void swim() {
        System.out.println("Swimming...");
    }
}

// derived class
class Bird extends Animal {
    void fly() {
        System.out.println("Flying...");
    }
}
