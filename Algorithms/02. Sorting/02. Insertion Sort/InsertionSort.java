public class InsertionSort {
    public static void insertionSort(int[] arr){
        int aux, j;
        for (int i=0; i<arr.length;i++){
            aux=arr[i];
            j=i-1;
            while(j>=0 && arr[j]>aux){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=aux;
        }
    }
}