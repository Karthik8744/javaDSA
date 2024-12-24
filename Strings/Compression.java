class Compression {

    /*
     * Compress the given string by converting aaa -> a3 but do not change to a -> a1 (as it is decompression)
     */
    static String compress(String str) {
        StringBuilder sb = new StringBuilder("");

        // Time complexity: O(n)
        for (int i = 0; i < str.length(); i++) {
            
            char ch = str.charAt(i);
            Integer count = 1;
            
            while (i != str.length()-1 && str.charAt(i+1) == ch) {
                count++;
                i++;
            }

            sb.append(ch);
            if (count > 1) {
                sb.append(count);
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        String str = "aaabbcccdd";
        String st = compress(str);
        System.out.println(st);
    }    
}
