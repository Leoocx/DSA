public class RecursiveBinarySearch {
    boolean binarySearch(int[] arr, int inicio, int fim, int elementoProcurado){
        if (inicio<=fim){
            int meio= (inicio+fim)/2;
            if (arr[meio]==elementoProcurado){
                return true;
            }else if(arr[meio]<elementoProcurado){
                return binarySearch(arr,meio+1,fim,elementoProcurado);
            }else{ //arr[meio]>elementoProcurado
                return binarySearch(arr,inicio,meio-1,elementoProcurado);
            }
        } return false;
    }
}
