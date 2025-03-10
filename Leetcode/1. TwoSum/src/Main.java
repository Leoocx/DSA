import java.util.HashMap;
import java.util.Map;

public class Main {

    public int[] twoSum(int[] nums, int target) {
        int[] result =new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            if (map.containsKey(target-nums[i])){
                result[1]=i;
                result[0]=map.get(target-nums[i]);
                break;
            }
            map.put(nums[i],i);
        }
        return result;
    }
    public static void main(String[] args) {
        /*
        * A ideia do target - nums[i] é procurar no mapa o número que já foi visto anteriormente e que, somado ao número atual (nums[i]), dá o target*/
    }
}