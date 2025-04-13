public class Main {

    public static int climbStairs(int n) {
        if (n==1 || n==0) return 1;

        int x=0,result=1;

        for (int i=1; i<=n;i++){
            result=result+x;
            x=result-x;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.print(climbStairs(2));
    }
}