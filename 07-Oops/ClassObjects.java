public class ClassObjects {
    public static void main(String[] args) {
        // Creation of an object p1 from pen class
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color = "Yellow";
        System.out.println(p1.color);

        // Creation of an object myAcc from BankAccount class
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Sai Karthik";
        System.out.println(myAcc.username);

        // Using Getters and Setters
        myAcc.setPassword("yo yo man");
        System.out.println(myAcc.getPassword());

        // Constructor testing
        Student s1 = new Student();
        s1.name = "Nani";
        s1.age = 30;
        s1.setPassword("Jersy");
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 70;
        System.out.println(s1.name);

        // Working with copy constructor (Shallow) 
        // Copying s1 contents to s3
        Student s3 = new Student(s1);
        s1.marks[2] = 80;     // Changes reflect
        /*
         * As this.marks = s.marks is written in the constructor and both of them are reference variables,
         * both of them points towards same array instead of s3 creating a new array.
         */
        System.out.println(s3.marks[2]);   // This gives 80


        Student s2 = new Student("Prabhas");
        s2.age = 40;
        s2.setPassword("Salaar");
        s2.marks[0] = 60;
        s2.marks[1] = 70;
        s2.marks[2] = 80;
        System.out.println(s2.name);
        // Working with copy constructor (Deep) 
        // Copying s2 contents to s4
        Student s4 = new Student(s2, "");
        s2.marks[2] = 100;     // Changes does not reflect
        System.out.println(s4.marks[2]);
    }
}


class BankAccount {
    public String username;
    private String password;

    // Setter
    void setPassword (String password) {
        // this means the current object
        this.password = password;
    }

    // Getter
    String getPassword () {
        return password;
    }
}


// Creation of a class
class Pen {
    String color;
    int tip;

    void setColor (String newColor) {
        color = newColor;
    }

    void setTip (int newTip) {
        tip = newTip;
    }
}


class Student {
    String name;
    int age;
    private String password;
    int marks[] = new int[3];

    // Shallow Copy constructor
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;

        // Here the this.marks and s.marks are both reference variables
        // Shallow copy
        this.marks = s.marks;   // marks is an array
    }

    // Deep copy consturctor
    Student(Student s, String buffer) {       // Buffer variable just to differentiate copy constructors during overloading
        this.name = s.name;
        this.age = s.age;
        for (int i = 0; i < s.marks.length; i++) {
            this.marks[i] = s.marks[i];
        }
    }

    // Non-parameterized
    Student () {
        System.out.println("A non-parameterized constructor is called in student class");
    }

    // Parameterized
    Student (String name) {
        System.out.println("A parameterized constructor is called in student class");
        this.name = name;
    }

    // Constructor overloading
    Student (String name, int age) {
        System.out.println("A parameterized constructor is called in student class");
        this.name = name;
        this.age = age;
    }

    void setPassword (String password) {
        this.password = password;
    }

    String getPassword () {
        return password;
    }
}