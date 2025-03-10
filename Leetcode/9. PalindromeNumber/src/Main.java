public class Main {

    public static boolean isPalindrome(int x) {
        if (x<0) return false;

        int palindromo = 0;
        int num = x;

        while (num>0){
            int digito=num%10;
            palindromo = palindromo*10 + digito;
            num/=10;
        }

        return x==palindromo;
    }



    public static void main(String[] args) {
        isPalindrome(121);
    }
}