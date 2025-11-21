package h2;

public class H2_main {
    public static void main(String[] args) {

        int n = 299;
        int digits = 0;
        int[] a;
        a = new int[9];

        for (int i = 0; i < a.length; i++) {
            a[i] = 0;
        }

        int r;
        int z = n;


        if ( n == 0) {
            digits = 1;
        } else {
            while (z != 0) {

                r = z % 10;
                z /= 10;


                digits += 1;
                a[a.length - digits] = r;

            }

        
        }
        
        System.out.println("n: " + n);
        System.out.println("digits: " + digits);
        for (int x : a) {
            System.out.print(x + " ");
        }
    }

}