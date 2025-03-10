import java.util.*;

public class Main {
    public static boolean containsDuplicate(int[] nums) {
        boolean result=false;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i< nums.length;i++){
            if (!set.add(nums[i])){
                result=true;
                break;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] nums={1,2,2,4,5};
        System.out.println(containsDuplicate(nums));

    }
}