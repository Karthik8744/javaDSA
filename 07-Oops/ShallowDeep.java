public class ShallowDeep {
    public static void main(String[] args) {
        // b shallow copies a
        int[] a = {5};
        int[] b = a;
        b[0] = 2;
        System.out.println("a-" + a[0]);
        System.out.println("b-" + b[0]);

        // d Deep copies c
        int[] c = {5};
        int[] d = new int[c.length];
        for(int i = 0; i < c.length; i++) {
            d[i] = c[i];
        }
        d[0] = 2;
        System.out.println("c-" + c[0]);
        System.out.println("d-" + d[0]);
    }
}
