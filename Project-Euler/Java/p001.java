public class p001 {

    public static int sumMultiples(int value){
        int result=0;
        for (int i=0; i<value; i++){
            if (i%3==0 || i%5==0) result+=i;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.print(sumMultiples(1000));


    }
}