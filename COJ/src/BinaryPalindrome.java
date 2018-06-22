
import java.util.Scanner;

public class BinaryPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k, i, j;
        boolean a=false;
        n = sc.nextInt();
        for (i = 0; i < n; i++) {
            int r1 = sc.nextInt(), r2 = sc.nextInt();
            for (k = r1; k <= r2; k++) {
                a = isBin(k);
                if (a == true) {
                    System.out.print(k + " ");
                }
            }
            System.out.println();
        }
    }

    public static boolean isBin(int x) {
        int   res;
        String b = "", aux, binNor = "";

        
        while (x > 0) {
            res = x % 2;
            if (res == 0) {
                b = b + "0";
            } else {
                b = b + "1";
            }
            x /= 2;
        }
        aux = b;
        for (int i = aux.length() - 1; i >= 0; i--) {
            binNor += aux.charAt(i);
        }
        if (b.equals(binNor)) {
            return true;
        } else {
            return false;
        }
    }
}
