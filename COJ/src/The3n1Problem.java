
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
public class The3n1Problem {
    public static void main (String []args){
        Scanner sc= new Scanner (System.in);
        
        int may=0,aux;
        int r1=sc.nextInt(); int r2=sc.nextInt();
        for(int i=r1; i<=r2; i++){
            aux=cycleLength(i);
            if(aux>may){
                may=aux;
            }
        }
        System.out.println(r1+" "+r2+" "+may);
        
    }
    
    static int cycleLength(int x){
        int c=0;
        while (x>=1){
            if(x%2==0){
                x/=2;
                c++;
            }else if(x==1){
                c++;
                break;
               
            }else{
                x=(3*x)+1;
                c++;
            }
        }
        return c;
    }
}
