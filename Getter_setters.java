// public class Getter_setters {
//     public static void main(String[] args) {
//         Pen p1 = new Pen();
//         p1.setColor("Blue");
//         System.out.println(p1.getColor());
//         p1.setTip(5);
//         System.out.println(p1.getTip());
//     }
// }

// class Pen {
//     // properties
//     private String color;
//     private int tip;

//     // behaviours----

//     // getters
//     String getColor() {
//         return this.color;
//     }

//     int getTip() {
//         return this.tip;
//     }

//     // setters
//     void setColor(String color) {
//         this.color = color;
//     }

//     void setTip(int tip) {
//         this.tip = tip;
//     }
// }

public class Getter_setters {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "saiyam";
        System.out.println(s1.name);
        // s1.password = "abcd"; not applicable
        s1.setPassword("abcd");
        System.out.println(s1.getPassword());
    }
}

class Pen {
    // properties
    String color;
    int tip;

    // behaviours || methods

    // setter
    void setColor(String color) {
        this.color = color;
    }

    void setTip(int tip) {
        this.tip = tip;
    }

    // getter
    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

}

class Student {
    // properties

    String name;
    int rollno;
    private String password;

    // setter
    void setPassword(String password) {
        this.password = password;
    }

    // getter
    String getPassword() {
        return this.password;
    }
}
