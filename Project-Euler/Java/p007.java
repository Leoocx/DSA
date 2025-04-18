public class p007 {

    static boolean isPrime(int n){
        if (n<= 1)
            return false;
        if (n<= 3)
            return true;
        if (n% 2 == 0 || n % 3 == 0)
            return false;
        int i = 5;
        while (i * i <= n) {
            if (n % i == 0 || n% (i + 2) == 0)
                return false;
            i += 6;
        }
        return true;
    }

    public static int n10001stPrime(){
        for (int i=2, count = 0; ;i++){
            if (isPrime(i)){
                count++;
                if (count == 10001){
                    return i;
                }
            }
        }
    }

    public static void main(String[] args){
        System.out.print(n10001stPrime());
    }

}
