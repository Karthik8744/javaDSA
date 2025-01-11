public class Inheritence {

    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
        dobby.eat("");

        Animal tillu = new Dog();
        // The below sentence gives error because though anm is an object of Dog class it is a reference variable of Animal which does not contain the property breed
        // System.out.println(tillu.breed);
        System.out.println(tillu.color);
    }
}

// Base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    // Method overloading
    void eat(String food) {
        System.out.println("eats " + food);
    }

    void breathe() {
        System.out.println("breathes");
    }
}

// Derived class
// Sigle level inheritence
class Mammal extends Animal {
    int legs;

    void walk() {
        System.out.println("walks");
    }
}

// Multilevel inheritence dog extends mammal extends animal
class Dog extends Mammal {
    String breed;

    // Method Overriding 
    void walk() {
        System.out.println("Runs");
    }

    void bark() {
        System.out.println("barks");
    }
}

// Hierarchial inheritence both cat and dog extends mammal
class Cat extends Mammal {
    String color;

    void jump() {
        System.out.println("jumps");
    }
}