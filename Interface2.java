
// implementation of multiple inheritance using interface

public class Interface2 {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.teethSize();
    }
}

interface Herbivore {
    void eat();
}

interface Carnivore {
    void teethSize();
}

class Bear implements Herbivore, Carnivore {
    public void eat() {
        System.out.println("Eating grass...");
    }

    public void teethSize() {
        System.out.println("5");
    }
}