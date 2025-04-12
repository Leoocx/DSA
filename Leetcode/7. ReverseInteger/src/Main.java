public class Main {
    public static int reverse(int x) {
            boolean isLess0 = false;
            if (x<0){
                isLess0=true;
                x*=-1;
            }
            long reverseNum = 0;
            while (x>0){
                int digit = x%10;
                reverseNum = 10 * reverseNum + (digit);
                x/=10;
            }
            if (reverseNum < Integer.MIN_VALUE || reverseNum> Integer.MAX_VALUE) return 0;
            if (isLess0) return Math.toIntExact(-reverseNum);
            return Math.toIntExact(reverseNum);
        }

        public static void main(String[] args){
        System.out.println(reverse(-3009));
        }
}