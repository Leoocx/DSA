import java.util.Arrays;

public class Main {

    public static int[] sortArrayByParity(int[] nums) {
        int i=0;
        int j= nums.length-1;
        while(i<j){
            while (i<j && nums[i]%2==0)
                i++;

            while (i<j && nums[j]%2==1)
                j--;
            int aux=nums[i];
            nums[i]=nums[j];
            nums[j]=aux;
        }
        return nums;
    }




    public static void main(String[] args) {
        int[] values = {3,1,2,4};
        sortArrayByParity(values);
    }
}