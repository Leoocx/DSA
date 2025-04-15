public class SelectionSort {

    public static void selectionSort(int[] arr){
        for (int i=0;i< arr.length -1 ;i++){
            int aux = i;
            for (int j=i+1;j< arr.length;j++){
                if (arr[j] < arr[aux]){
                    aux = j;
                }
            }
            if (aux != i){
                int temp = arr[i];
                arr[i]=arr[aux];
                arr[aux]=temp;
            }
        }
    }
}