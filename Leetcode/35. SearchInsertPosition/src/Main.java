public class Main {

    public static int searchInsert(int[] nums, int target) {
        int index=0;

        for(int i=0; i< nums.length;i++){
            if (nums[i]==target) return i;
            if (nums[0]>target) return 0;
            if (nums[nums.length-1]<target) return nums.length;
        }
        for (int j=0; j<nums.length+1;j++){
            if (target<nums[j+1] && target>nums[j]) {
                index=j+1;
                break;
            }
        }
        return index;
    }





    public static void main(String[] args) {
        int[] test= {1,3,5,6};
        System.out.println(searchInsert(test,0));
    }
}