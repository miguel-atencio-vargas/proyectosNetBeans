
import java.util.Scanner;

public class BinOrueba {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x, num, res;
        String b = "", aux, binNor = "";

        x = sc.nextInt();
        num = x;
        
        while (num > 0) {
            res = num % 2;
            if (res == 0) {
                b = b + "0";
            } else {
                b = b + "1";
            }
            num /= 2;
        }
        aux = b;
        for (int i = aux.length() - 1; i >= 0; i--) {
            binNor += aux.charAt(i);
        }
        if (b.equals(binNor)) {
            System.out.println("SI es palindromo");
        } else {
            System.out.println("NO es palindromo");
        }
    }
}
