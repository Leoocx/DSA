public class BubbleSort {
    //O(n^2)
    void bubbleSort(int[] arr){
        for (int i=0;i<arr.length;i++){ //O(n)
            for(int j=i+1; j<arr.length; j++){ ////O(n)
                if (arr[i]>arr[j]){
                    int aux=arr[i];
                    arr[i]=arr[j];
                    arr[j]=aux;
                }
            }
        }
    }
}