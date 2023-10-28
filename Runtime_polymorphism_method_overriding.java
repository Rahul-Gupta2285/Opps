public class Runtime_polymorphism_method_overriding {
    public static void main(String[] args) {
        Deer myDeer = new Deer();
        myDeer.eat();
        myDeer.legs = 2;
        System.out.println(myDeer.legs);
    }
}

class Animal {

    int legs;

    void eat() {
        System.out.println("Eating...");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("Eating grass...");
    }
}