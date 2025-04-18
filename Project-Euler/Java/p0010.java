public class p0010 {
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
    public static long sumPrimes(){
        long sum = 0;

        for (int i=2; i<2000000; i++){
            if (isPrime(i)){
                sum+=i;
            }
        }
        return sum;
    }




    public static void main(String[] args){
        System.out.println(sumPrimes());
    }

}
