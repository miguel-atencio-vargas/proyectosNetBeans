
public class FrogJmp {

    public static int solution(int x, int y, int d) {
        int c=0;
        while (x <= y && x!=y) {
            x+=d;
            c++;
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(solution(3, 999111321, 7));
    }
}
