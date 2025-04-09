import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public String largestNumber(int[] nums) {
        ArrayList<String> arr = new ArrayList<>();
        String ans="";
        for (int i=0;i< nums.length;i++){
            arr.add(Integer.toString(nums[i]));
        }
        arr.sort((a,b)->{
            if ((a+b).compareTo(b+a)>0) return -1;
            return 1;
        });

        for (int i=0;i< arr.size();i++){
            ans+=arr.get(i);
        }
        if (ans.charAt(0)=='0') return "0";
        return ans;
    }
}