
import java.util.Scanner;

public class Cacho {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        int i;
        String r;
        for (i = 0; i < cases; i++) {
            String limpio = leer();
            r = eval(limpio);
            System.out.println(r);
        }
    }

    public static String leer() {
        Scanner sc = new Scanner(System.in);
        String z = sc.nextLine();
        z = z.replace(" ", "");
        return z;
    }

    public static String eval(String x) {
        char[] num = new char[10];
        String b, b1;
        int aux, c = 0, aux1;
        num = x.toCharArray();

        for (int i = 0; i < 4; i++) {

            b = Character.toString(num[i]);
            b1 = Character.toString(num[i + 1]);
            aux1 = Integer.valueOf(b1);
            aux = Integer.valueOf(b) + 1;
            if (aux != aux1) {
                c++;
            }
        }
        if (c > 0) {
            return "N";
        } else {
            return "Y";
        }

    }
    }
