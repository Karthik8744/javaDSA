class Operators {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        
        // AND operator
        System.out.println("AND: " + (a&b));
        
        // OR operator
        System.out.println("OR: " + (a|b));
        
        // XOR operator
        System.out.println("XOR: " + (a^b));
        
        // One's complement operator
        System.out.println("NOT: " + (~a));
        
        // Left shift operator
        System.out.println("Left Shift: " + (a << b));
        
        // Right shift operator
        System.out.println("Right Shift: " + (a >> b));
    }
}