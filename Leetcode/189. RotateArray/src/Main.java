class Main {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;

        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        System.gc();

    }

    private void reverse(int[] nums,int first,int end){
        while(first<end){
            int temp = nums[first];
            nums[first] = nums[end];
            nums[end] = temp;
            first++;
            end--;
        }
    }
}
