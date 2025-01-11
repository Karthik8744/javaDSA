public class Stringbuilder {
    public static void main(String[] args) {
        // Creation of StringBuilder
        StringBuilder sb = new StringBuilder("");

        // Time complexity: O(n)
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        
        // Converting StringBuilder to String
        // ⭐ toString converts any object(StringBuilder, Integer, Character) to a string
        String str = sb.toString();
        System.out.println(str);

        // Length of string builder
        sb.length();
        // It also contains several other functions which are present in the string
    }    
}
