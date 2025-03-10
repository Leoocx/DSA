import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static int majorityElement(int[] nums) {
        int count=0;
        int result=nums[0];

        for (int i:nums){
            if (count==0){
                result=i;
            }
            if (i==result){
                count++;
            }
            else{
                count--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
            int[] test= {6,5,5};
            System.out.println(majorityElement(test));
        }
    }

