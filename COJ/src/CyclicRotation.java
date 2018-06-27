
public class CyclicRotation {

    public static void main(String[] args) {
        int b[] = new int[100];
        b[0] = 1;
        b[1] = 2;
        b[2] = 3;
        b[3] = 4;
        b = solution(b, 1);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }

    public static int[] solution(int[] A, int k) {
        int aux;
        for (int j = 0; j < k; j++) {
            for (int i = 0; i < A.length; i++) {
                if(i>A.length-1){
                    i=0;
                }
                aux = A[i + 1];
                A[i + 1] = A[i];
                A[i + 2] = aux;
            }
        }
        return A;
    }

}
