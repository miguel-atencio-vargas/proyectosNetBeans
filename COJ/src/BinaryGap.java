/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author atenc
 */
public class BinaryGap {

    public static void main(String[] args) {
        System.out.println(solution(21));
    }

    public static int solution(int n) {
        int r;
        String bin = "";
        while (n > 0) {
            r = n % 2;
            if (r == 0) {
                bin = bin + "0";
            } else {
                bin = bin + "1";
            }
            n = n / 2;
        }
        int z = 0, c = 0, auxC = 0, may = 0;
        String ss = "";
        
        for (int i = 0; i < bin.length(); i++) {
            ss = Character.toString(bin.charAt(i));
           
            if (ss.equals("1")) {
                if (z == 0) {
                    z = 1;
                } else {
                    auxC = c;
                    c=0;
                }
            } else {
                if (z == 1) {
                    c++;
                } else {
                    auxC = c;
                    c = 0;
                }
            }
           
            if (auxC > may) {
                may = auxC;
            }
        }
        return may;
    }
}
