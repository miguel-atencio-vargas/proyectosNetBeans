
import java.util.Scanner;

public class Tuna {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int x=sc.nextInt();
        int may,men,p3,sum=0;
        for(int i=0;i<a;i++){
            int b=sc.nextInt(),c=sc.nextInt();
            if(b>c){
                may=b;
                men=c;
            }else{
                may=c;
                men=b;
            }
            if(may-men>x){
                p3=sc.nextInt();
                sum+=p3;
            }else{
                sum+=may;
            }
        }
        System.out.println(sum);
    }
}
