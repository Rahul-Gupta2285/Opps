public class Constructor2 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        System.out.println("Number: " + obj.number);
        System.out.println("Text: " + obj.text);
    }
}

class MyClass {
    int number;
    String text;

    MyClass() { // ==> defaullt contructor || non - parameterized constructor
        System.out.println("Welcome");
    }
}
