public class p006 {

    public static int sumSquareDifference(){
        int n = 100;
        int i = 1;
        int squareSum = ((n*(n+1))/2)*((n*(n+1))/2);
        int sumSquare = 0;
        while (i<101){
            sumSquare += i*i;
            i++;
        }

        return squareSum-sumSquare;
    }


    public static void main(String[] args){
        System.out.print(sumSquareDifference());
    }

}
