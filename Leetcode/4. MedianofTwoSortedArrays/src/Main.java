import java.util.Arrays;

public class Main {
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

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] values = new int[m+n];

        System.arraycopy(nums1, 0, values, 0, m);
        System.arraycopy(nums2, 0, values, m, n);

        sort(values);

        int len = values.length;
        if (!(len % 2 == 0)) {
            return values[len / 2];
        }
        return (values[len / 2 - 1] + values[len / 2]) / 2.0;
    }

    public static void main(String[] args) {
        int[] values1 ={2,2,4,4};
        int[] values2 ={2,2,2,4,4};

        System.out.println(findMedianSortedArrays(values1,values2));
    }
}