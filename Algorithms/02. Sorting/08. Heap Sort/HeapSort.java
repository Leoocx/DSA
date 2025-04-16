public class HeapSort {

    public static void heapSort(int[] arr){
        int n=arr.length;
        for (int i=n/2-1; i >= 0; i--){
            swap(arr, n, i);
        }

        for (int j=n-1; j>0; j--){
            int aux=arr[0];
            arr[0]=arr[j];
            arr[j]=aux;

            swap(arr, j, 0);
        }
    }

    public static void swap(int[] arr, int n, int i){
        int raiz = i;
        int esquerda = 2*i+1;
        int direita = 2*i+2;

        if (esquerda<n && arr[esquerda] > arr[raiz]){
            raiz = esquerda;
        }
        if (direita<n && arr[direita] > arr[esquerda]){
            raiz = direita;
        }

        if (raiz != i){
            int aux = arr[i];
            arr[i]=arr[raiz];
            arr[raiz]=aux;

            swap(arr, n, raiz);
        }
    }

}