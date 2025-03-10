public class Main {

    public static void sortColors(int[] nums) {
        int n=nums.length;
        int min, aux;
        for (int i=0; i< n-1; i++){
            min=i;
            for (int j=i+1; j<n; j++){
                if (nums[j]<nums[min]) min=j;
            }
            if (nums[i] != nums[min]){
                aux=nums[i];
                nums[i]=nums[min];
                nums[min]=aux;
            }
        }
    }

    public static void main(String[] args) {
        int[] test={2,0,1};
        sortColors(test);
    }
}