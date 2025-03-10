public class Main {


    public static int sumSquared(int n){
        int result=0;
        while (n>0){
            result+=(n%10)*(n%10);
            n=n/10;
        }
        return result;
    }

    public static boolean isHappy(int n) {
        int sum = sumSquared(n);
        while (true){
            if (sum==1) return true;
            if (sum==37) return false;
            sum=sumSquared(sum);
        }
    }

    public static void main(String[] args) {
        System.out.println(isHappy(12));

    }
}