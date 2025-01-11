public class Abstraction {
    public static void main(String[] args) {
        // Abstract classes
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();

        // When we create an object for a derived class then it calls the constructor of base class
        // First animal constructor is called then horse and then mustang constructor is called
        new Mustang();

        // Interfaces
        Queen q = new Queen();
        q.moves();
    }
}

// Abstract classes
// Cannot create classes for abstract classes
abstract class Animal {
    String color;
    Animal() {
        // Default color for all the derived classes
        color = "brown";
        System.out.println("Animal constructor called");
    }

    void eat() {
        System.out.println("Animal eats");
    }

    // idea
    abstract void walk();
}


class Horse extends Animal {
    Horse () {
        System.out.println("Horse constructor called");
    }

    void changeColor () {
        color = "dark brown";
    }

    // Derived class must implement abstract methods of the base class
    // implementation
    void walk() {
        System.out.println("Horse walks on 4 legs");
    }
}


class Mustang extends Horse {
    Mustang () {
        // Java by default calls super constructor
        // To access immediate parent class
        super();
        System.out.println("Mustang constructor called");
    }
}


class Chicken extends Animal {
    void changeColor () {
        super.color = "Yellow";
    }

    // implementation
    void walk() {
        System.out.println("Chicken walks on 2 legs");
    }
}


// Interfaces
interface ChessPlayer {
    // By default methods are public and abstract in interfaces
    // idea
    void moves();
}

class Queen implements ChessPlayer {
    // ⭐ public must be written otherwise it thinks it as default 
    // implementation
    public void moves () {
        System.out.println("up, down, left, rigth, diagonal - (in all 4 directions)");
    }
}


class Rook implements ChessPlayer {
    // implementation
    public void moves () {
        System.out.println("up, down, left, rigth");
    }
}


class King implements ChessPlayer {
    public void moves () {
        System.out.println("up, down, left, rigth, diagonal - (by 1 step)");
    }
}