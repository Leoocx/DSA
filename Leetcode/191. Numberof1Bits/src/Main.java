public class Main {

    public static int hammingWeight(int n) {
        int countOnes=0;
        String bin = Integer.toString(n, 2);;

        for (int i=0; i<bin.length(); i++){
            if (bin.charAt(i)=='1'){
                countOnes++;
            }
        }
        return countOnes;
    }



    public static void main(String[] args) {
        System.out.println(hammingWeight(2147483645));

    }
}