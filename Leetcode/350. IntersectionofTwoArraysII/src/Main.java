import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> intersection = new ArrayList<>();
        int i=0,j=0;
        while (i< nums1.length && j< nums2.length){
            if (nums1[i]<nums2[j]) i++;
            else if (nums1[i]>nums2[j]) j++;
            else {
                intersection.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] result = new int[intersection.size()];
        for (int k=0; k<intersection.size();k++){
            result[k]=intersection.get(k);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] teste = {1,2,2,1};
        int[] teste2 = {2,2};
        intersect(teste, teste2);
    }
}