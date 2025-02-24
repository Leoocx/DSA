import java.util.Arrays;

class Main {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes=0;
        int countOnes=0;

        for (int num: nums){
            if (num==1){
                countOnes++;
            }
            else{
                maxOnes = Math.max(maxOnes,countOnes);
                countOnes=0;
            }
        }

        return Math.max(maxOnes, countOnes);
    }
}

/**/