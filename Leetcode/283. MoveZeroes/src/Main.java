import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void moveZeroes(int[] nums) {
        int sequenceZeroes=0;
        for (int i=0; i< nums.length;i++){
            if (nums[i]==0){
                sequenceZeroes++;
            }
            else if (sequenceZeroes>0){
                int aux=nums[i];
                nums[i]=0;
                nums[i-sequenceZeroes]=aux;
            }
        }
    }



    public static void main(String[] args) {
        int[] test = {0,1,0,3,12};
        moveZeroes(test);
    }
}