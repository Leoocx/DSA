public class p005 {


    public static int smallestMultiple(){
        int result = -1;
        int i = 2520;
        int[] values = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        for (int j=0; j<values.length; j++){
            if (i % values[j] != 0){
                i++;
                j=0;
            } else{
                result=i;
            }
        }

        return result;
    }

    public static void main(String[] args){
        System.out.print(smallestMultiple());
    }
}
