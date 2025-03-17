import java.util.Arrays;

public class Main {


    public static int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=n*(n+1)/2;
        int aux=0;
        for (int value: nums){
            aux+=value;
        }
        return sum - aux;

    }

    public static void main(String[] args) {
        int[] teste = {0,1,2,3,4,5,6,7,9};
        System.out.println(missingNumber(teste));
    }
}