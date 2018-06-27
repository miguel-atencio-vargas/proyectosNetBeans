
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
public class OstapAndGrasshopper {
    public static void main(String []args){
        Scanner sc= new Scanner (System.in);
        int a=sc.nextInt(); int b=sc.nextInt();
        String c=sc.next();
        int p=0;
        for(int i=0;i<c.length();i++){
            if(c.charAt(i)=='G'||c.charAt(i)=='T'){
                p=i;
                break;
            }
        }
        p=p+b;
        c=c+"DDDD";
        while(true){
            if( c.charAt(p)=='#'||c.charAt(p)=='D'){
                System.out.println("NO");
                break;
            }
            
            if(c.charAt(p)=='.'){
                p=p+b;
            }
            if(c.charAt(p)=='T'||c.charAt(p)=='G'){
                System.out.println("YES");
                break;
            }
            
        }
    }
}
