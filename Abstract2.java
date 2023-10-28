public class Abstract2 {
    public static void main(String[] args) {

        // which contructor is called first

        // Animal -> Horse -> Mustang

        Mustang myMustang = new Mustang();

    }
}

abstract class Animal {

    Animal() {
        System.out.println("Animal constructor called...");
    }

}

class Horse extends Animal {

    Horse() {
        System.out.println("Horse contructor called...");
    }
}

class Mustang extends Horse {

    Mustang() {
        System.out.println("Mustang contructor called...");
    }

}
