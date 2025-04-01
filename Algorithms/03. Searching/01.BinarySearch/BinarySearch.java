public class BinarySearch {
    public static void buscaBinaria(int[] arr, int elementoProcurado){
        int inicio=0;
        int fim=arr.length-1;
        int meio;
        boolean encontrou=false;
        while (inicio<=fim){
            meio = (inicio+fim)/2;
            if (arr[meio]==elementoProcurado){
                encontrou=true;
                break;
            }else if(arr[meio]<elementoProcurado){
                inicio=meio+1;
            }else{ //meio>elementoProcurado
                fim=meio-1;
            }
        }
        System.out.println(encontrou);
    }
}