import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static int removeElement(int[] nums, int val) {
        int j=0;
        for (int i=0; i< nums.length; i++){
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] test={3,2,2,3};
        System.out.println(removeElement(test,3));
    }
}