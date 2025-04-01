public class LinearSearch {

    static boolean linearSearch(int[] arr, int elemento){
        if (arr.length==0){
            return false;
        }
        for (int i=0; i<arr.length; i++){
            if (arr[i]==elemento){
                return true;
            }
        }
        return false;
    }
}
