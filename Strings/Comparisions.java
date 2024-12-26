public class Comparisions {
    public static void main(String[] args) {
        String str = "hello";
        String str1 = "-karthik";
        String str2 = "hello";
        String str3 = new String("hello");

        if (str == "hello") // returns true
        {
            System.out.println("one");
        }
        if ("hello" == "hello")  // returns true
        {
            System.out.println("two");
        }
        if (str+str1== "hello-karthik")  // return false
        {
            System.out.println("three");
        }
        if (str == str2)  // returns true
        {
            System.out.println("four");
        }
        if (str == str3)  // returns false
        {
            System.out.println("five");
        }

        
        if (str.equals(str3))   // returns equal
        {
            System.out.println("equal");
        }
        else {
            System.out.println("different");
        }


        if((str+str1).equals("hello-karthik"))   // returns true
        {
            System.out.println("equal");
        }
        else {
            System.out.println("different");
        }
    }    
}
