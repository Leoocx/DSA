import java.util.Random;

public class Merge {

    static void merge(int[] A, int inicio, int fim){
        if (inicio < fim){
            int meio = (inicio + fim) / 2;
            merge(A, inicio, meio);
            merge(A, meio + 1, fim);
            combina(A, inicio, meio, fim);
        }
    }

    static void combina(int[] A, int inicio, int meio, int fim){
        int n1 = meio - inicio + 1;
        int n2 = fim - meio;

        int[] B = new int[n1];
        int[] C = new int[n2];

        for (int i = 0; i < n1; i++){
            B[i] = A[inicio + i];
        }

        for (int j = 0; j < n2; j++){
            C[j] = A[meio + 1 + j];
        }

        int i = 0, j = 0, k = inicio;

        while (i < n1 && j < n2){
            if (B[i] <= C[j]){
                A[k] = B[i];
                i++;
            } else{
                A[k] = C[j];
                j++;
            }
            k++;
        }

        while (i < n1){
            A[k] = B[i];
            i++;
            k++;
        }

        while (j < n2){
            A[k] = C[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] numeros = new int[1000]; // Tamanho do array
        Random rand = new Random();

        // Preenche com valores aleatórios entre 0 e 99
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(100);
        }

        System.out.println("Antes da ordenação:");
        for (int n : numeros) {
            System.out.print(n + " ");
        }
        System.out.println();

        merge(numeros, 0, numeros.length - 1);

        System.out.println("Depois da ordenação:");
        for (int n : numeros) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
