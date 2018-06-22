
import java.util.Scanner;

public class Rejilla {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, m, i, j;
        int mm[][] = new int[10][10];

        System.out.println("Ingrese el numero de filas M ");
        m = sc.nextInt();
        System.out.println("Ingrese el numero de culumnas N ");
        n = sc.nextInt();

        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                mm[i][j]=1;
            }
        }
        
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(mm[i][j]+" ");
            }
            System.out.println();
        }
    }
}
