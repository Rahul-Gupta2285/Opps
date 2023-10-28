public class Compile_time_polymorphism_method_overloading {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        System.out.println(myCalculator.sum(1, 2));
        // System.out.println(myCalculator.sum((float) 1.0, (float) 2.0));
        // System.out.println(myCalculator.sum(1, 2, 0));
    }
}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

// public class Compile_time_polymorphism_method_overloading {
// public static void main(String[] args) {
// Cylinder c1 = new Cylinder();
// System.out.println(c1.vol(4, 5));
// }
// }

// class Cylinder {
// int height;
// int radius;

// double vol(int height, int radius) {
// return (3.14 * radius * radius * height);
// }
// }
