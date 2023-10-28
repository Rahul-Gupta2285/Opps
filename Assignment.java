public class Assignment {
    public static void main(String[] args) {
        Complex c = new Complex(6, 6);
        Complex d = new Complex(5, 5);

        Complex e = Complex.add(c, d);
        Complex f = Complex.diff(c, d);

        e.printComplex();
        f.printComplex();
    }
}

class Complex {
    int real;
    int imaginary;

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public static Complex add(Complex a, Complex b) {
        return new Complex((a.real + b.real), (a.imaginary + b.imaginary));
    }

    public static Complex diff(Complex a, Complex b) {
        return new Complex((a.real - b.real), (a.imaginary - b.imaginary));
    }

    public void printComplex() {
        System.out.println(real + "+" + imaginary + "i");
    }
}
