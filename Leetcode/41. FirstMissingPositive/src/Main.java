import java.util.Arrays;

public class Main {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        int result=1;

        for (int i=0; i<n ;i++){
          if (nums[i]==result){
              result++;
          }
        }
        return result;

    }
}