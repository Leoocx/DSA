import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        sort(nums1);
    }

    public static int[] sort(int[] list){
        int aux=0;
        for (int i=0;i<list.length-1;i++){
            for (int j=0;j< list.length-1;j++){
                if (list[j]>list[j+1]){
                    aux=list[j];
                    list[j]=list[j+1];
                    list[j+1]=aux;
                }
            }
        }
        return list;
    }

    public static void main(String[] args){
        int[] vet1 = {1,2,3,0,0,0};
        int[] vet2 = {2,5,6};
        merge(vet1, 3, vet2, 3);
    }
}