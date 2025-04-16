public class ShellSort {

    static void shellSort(int[] arr){
        int n= arr.length;;
        int h=1;

        while (h<n){
            h=h*3 + 1;
        }
        h = (int) Math.floor(h/3);

        int elemento, j;

        while (h>0){
            for (int i=h; i<n; i++){
                elemento=arr[i];
                j=i;
                while (j>=h && arr[j-h]>elemento){
                    arr[j] = arr[j-h];
                    j-=h;
                } arr[j]=elemento;
            }
            h/=2;
        }
    }
}