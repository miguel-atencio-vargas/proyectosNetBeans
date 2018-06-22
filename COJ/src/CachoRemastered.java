
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author atenc
 */
public class CachoRemastered {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        int cc = sc.nextInt();
        for (int i = 0; i < cc; i++) {
            int sw=0;
            a[0]=sc.nextInt();a[1]=sc.nextInt();a[2]=sc.nextInt();a[3]=sc.nextInt();a[4]=sc.nextInt();
            for (int j = 0; j < 4; j++) {
                if (a[j] + 1 != a[j + 1]) {
                    sw = 1;
                }
            }
            if (sw == 0) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
            
        }

    }

}
