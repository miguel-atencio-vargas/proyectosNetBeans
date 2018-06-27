
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
public class WayTooLongWords {
    public static void main (String []args){
        Scanner sc= new Scanner (System.in);
        int a=sc.nextInt();
        do{
            String w=sc.next();
            if(w.length()>10){
                System.out.println(w.charAt(0)+""+(w.length()-2)+""+w.charAt(w.length()-1));
            }else{
                System.out.println(w);
            }
            a--;
        }while(a>0);
    }
}
