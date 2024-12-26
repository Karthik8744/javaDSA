import java.util.Scanner;

public class Operations {
    public static void main (String[] args) {
        // Creation of strings
        String str = "abcd";
        String str1 = new String("xyz");
        
        // Input and Ouput of Strings
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Sentence");
        str = sc.next();      // Takes 1st word of the input
        sc.nextLine();

        System.out.println("Enter a Sentence");
        str1 = sc.nextLine();      // Takes all the words of the input

        System.out.println("1st string: " + str + "\n2nd String: " + str1);

        // Concatenation
        String str2 = str + " " + str1;

        // Length of a string
        int len = str2.length();    // ⭐length() is a function unlike a property in arrays

        System.out.println(str2 + "\nThe above sentence is of length: " + len);

        sc.close();
    }
}