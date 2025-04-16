class QuickSort {

    static void quickSort(int[] arr, int esquerda, int direita){
        if (esquerda<direita){
            int p = particao(arr, esquerda, direita);
            quickSort(arr, esquerda, p);
            quickSort(arr, p+1, direita);
        }
    }

    static int particao (int[] arr, int esquerda, int direita){
        int meio= (esquerda+direita)/2;
        int pivo = arr[meio];
        int i = esquerda-1;
        int j = direita+1;

        while (true){
            do{
                i++;
            } while (arr[i]<pivo);
                do {
                    j--;
                } while (arr[j]>pivo);
                if (i>=j){
                    return j;
                }
                int aux = arr[i];
                arr[i]=arr[j];
                arr[j]=aux;
            }
        }
}