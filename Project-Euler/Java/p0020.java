import java.math.BigInteger;

public class p0020 {

    public static int factorialDigitSum(){
        int number = 100;
        int sum = 0;
        BigInteger factorial = Library.factorial(number);

        String digits = factorial.toString();

        for (int i=0; i<digits.length();i++){
            sum+=Character.getNumericValue(digits.charAt(i));
        }
        return sum;
    }




    public static void main(String[] args){
        System.out.print(factorialDigitSum());
    }

}
