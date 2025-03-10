import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i=0;i< nums.length; i++){
            set.add(nums[i]);
        }
        Integer[] arr = set.toArray(new Integer[0]);
        Arrays.sort(arr);

        int aux=0;
        for (int i:arr){nums[aux]=i; aux++;}

        return set.size();

    }
    public static void main(String[] args) {
        int[] test= {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(test);
    }
}