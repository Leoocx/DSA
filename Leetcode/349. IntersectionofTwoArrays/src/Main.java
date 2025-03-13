import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> arr = new HashSet<>();
        Set<Integer> aux = new HashSet<>();
        for (int i=0; i<nums1.length; i++){
            arr.add(nums1[i]);
        }
        for (int i=0; i<nums2.length; i++){
            aux.add(nums2[i]);
        }
        arr.retainAll(aux);
        int[] result = new int[arr.size()];
        int k=0;
        for (int value: arr){
            result[k]=value;
            k++;
        }
        return result;
    }

    public static void main(String[] args) {
    }
}