import java.util.*;

public class Main {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean result=false;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if (map.containsKey(nums[i]) && (i-map.get(nums[i])<=k)){
                result=true;
            }
            map.put(nums[i],i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] values={1,2,3,1,2,3};
        System.out.println(containsNearbyDuplicate(values, 2));
    }
}