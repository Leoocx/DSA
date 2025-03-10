public class Main {
    public int findNumbers(int[] nums) {
        int result=0;

        for (int i=0;i<nums.length;i++){
            String numStr=nums[i]+"";
            if (numStr.length()%2==0){
                result++;
            }
        }
        return result;
    }
    public static void main(String[] args){

    }
}