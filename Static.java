public class Static {
    public static void main(String[] args) {
        // Student s1 = new Student();
        Student.schoolName = "Dev samaj";
        System.out.println(Student.percentage(5, 5, 5));

        // Student s2 = new Student();
        System.out.println(Student.schoolName);
        Student.schoolName = "abc";

        // Student s3 = new Student();
        System.out.println(Student.schoolName);
    }
}

class Student {
    int rollNo;
    String name;

    static String schoolName;

    static int percentage(int phy, int maths, int chem) {
        return (phy + maths + chem) / 3;

    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

}