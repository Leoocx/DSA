public class p002 {

    public static int sumFib(){
        int sum=0;
        int x = 1;
        int y = 2;
        while (sum<=4000000){
            if (x%2==0){
                sum+=x;
            }
            int aux=x+y;
            x=y;
            y=aux;
        }
        return sum;
    }


    public static void main(String[] args){
        System.out.print(sumFib());

    }

}
