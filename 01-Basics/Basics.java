import java.util.*;

public class Basics {

    // a and b are parameters (or) formal parameters
    // Java always call by value
    static int sum (int a, int b) {
        return a + b;
    }

    // Conditional statements
    static int greater (int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        }
        else if (b > c) {
            return b;
        }
        else {
            return c;
        }
    }

    // ternary operator
    static void checkOdd (int a) {
        String c = a % 2 == 0 ? "even" : "odd";
        System.out.println(a + " is " + c);
    }

    // Switch
    static void calc (int a, int b, char c) {
        switch (c) {
            case '+': System.out.println(a + b);
                        break;
            case '-': System.out.println(a - b);
                        break;
            case '*': System.out.println(a * b);
                        break;
            case '/': System.out.println(a / b);
                        break;
            case '%': System.out.println(a % b);
                        break;
            default : System.out.println("Enter only +, -, *, /, %.");
        }
    }

    // while loop
    static void reverse (int n) {
        int rev = 0;
        int lastDigit;
        while (n != 0) {
            lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
            n /= 10;
        }
        System.out.println(rev);
    }

    // For loop
    static void pattern (int n) {
        // for (initialisation; condition; updation)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    // do while
    // break and continue
    static void enter () {
        Scanner sc = new Scanner(System.in);
        int n;
        // if multiple of 5 skip, if multiple of 10 end
        System.out.print("Enter multiple of 10 to exit and multiple 5 to skip ");

        do {
            System.out.print("Enter a number: ");
            // Inputing variable
            n = sc.nextInt();

            if (n % 10 == 0) {
                break;
            }
            else if (n % 5 == 0) {
                continue;
            }

            System.out.println(n);
        } while (true);

        sc.close();
    }

    static boolean isPrime (int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void primesInRange (int n) {
        for (int i =2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Initializing variables
        int a = 10;
        // a is a identifier(name) of a variable 
        // 10 is literal

        // Data types
        byte b = 8;
        char ch = 'a';
        boolean var = false;
        float price = 10.5f;

        if (var) {
            System.out.println(a + b + ch + price);
        }

        int number = 12345;        
        
        // type cast(narrowing conversion)
        number = (byte) number;

        // Unary
        // pre-increment
        int c = 10;
        int pre = ++c;
        c = 10;
        int post = c++;
        System.out.println(pre + " and " + post);
        System.out.println();


        System.out.println(greater(10, 15, 20));  // 10, 15, 20 are arguments (or) actual parameters
        checkOdd(11);
        System.out.println();


        calc(10, 6, '%');
        System.out.println();

        reverse(234567);
        pattern(5);
        enter();

        primesInRange (100);
    }
}