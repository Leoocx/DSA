public class Main {

    public static int maxSubArray(int[] nums) {
        int maxAtual=nums[0];
        int result=nums[0];

        for (int i=1; i< nums.length; i++){
            maxAtual = Math.max(nums[i], maxAtual+nums[i]);
            result=Math.max(result, maxAtual);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] values = {1};
        System.out.println(maxSubArray(values));
    }
}