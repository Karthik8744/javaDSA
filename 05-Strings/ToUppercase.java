public class ToUppercase {
    /*
     * For a given string convert the first letter in each of the word to uppercase
     */

    // Time complexity: O(n)
    static void uppercase(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length()-1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else {
                sb.append(str.charAt(i));
            }
        }
        String st = sb.toString();
        System.out.println(st);
    }

    
    public static void main(String[] args) {
        String str = "hello, my name is karthik.";
        uppercase(str);
    }    
}
