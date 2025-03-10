public class Main {
    public int[] sortedSquares(int[] nums) {
        int[] vet=new int[nums.length];
        int aux=0;

        for (int i=0;i<nums.length;i++){
            vet[i]=nums[i]*nums[i];
        }

        for (int i=0;i<vet.length-1;i++){
            for (int j=0;j< vet.length-1-i;j++){
                if (vet[j]>vet[j+1]){
                    aux=vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1]=aux;
                }
            }
        }
        return vet;
    }

    public static void main(String[] args) {
        //int[] vet = {5,3,2,1,12,11,100,13};
        //sortedSquares(vet);
    }
}