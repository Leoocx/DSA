import java.math.BigInteger;

public class p0016 {

    public static long powerDigitSum(){
        BigInteger value = BigInteger.valueOf(2).pow(1000);
        String digits = value.toString();
        int sum = 0;

        for (int i=0; i<digits.length();i++){
            sum += digits.charAt(i) - '0';
        }
        return sum;
    }

    public static void main(String[] args){
        System.out.print(powerDigitSum());
    }
}
