public class CopyConstructor { // shallow copy
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Rahul";
        s1.roll = 256;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password = "xyz";
        s1.marks[0] = 200;
        for (int i = 0; i < s1.marks.length; i++) {
            System.out.println(s2.marks[i]);
        }
        System.out.println(s2.name);
        System.out.println(s2.roll);
        System.out.println(s2.password);
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // shallow copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }

    Student() { // non paramiterized constructor
        marks = new int[3];
        System.out.println("Constructor is called...");
    }

    Student(String name) { // paramiterized constructor
        marks = new int[3];
        this.name = name;
    }
}
