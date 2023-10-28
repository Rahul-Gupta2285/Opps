public class ShallowCopy {
    public static void main(String[] args) {
        // Create an p1 person
        Person p1 = new Person("Alice", 25);

        // Create a shallow copy of the p1 person using the copy constructor
        Person p2 = new Person(p1); // Shallow copy

        // Modify the age of the p2 person
        p2.age = 30;

        // Check the age of both p1, p2 persons
        System.out.println("p1 Person's Age: " + p1.age);
        System.out.println("p2 Person's Age: " + p2.age);
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Shallow copy constructor
    public Person(Person p1) {
        this.name = p1.name;
        this.age = p1.age;
    }
}
