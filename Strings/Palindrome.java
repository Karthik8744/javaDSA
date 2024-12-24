import java.util.Scanner;

class Palindrome {

    // Time complexity: O(n)
    static boolean palindrome(String str) {
        int n = str.length();

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) != str.charAt(n-i-1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (palindrome(str)) {
            System.out.println("It is a palindrome");
        }
        else {
            System.out.println("It is not a palindrome");
        }

        sc.close();
    }
}
