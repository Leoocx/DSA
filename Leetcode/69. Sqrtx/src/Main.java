public class Main {


    public static int mySqrt(int x) {
        if (x==0) return 0;
        double sqrt =x;
        double precisao = 0.001;
        while (Math.abs(sqrt*sqrt - x) > precisao){
            sqrt=(sqrt+x/sqrt)/2;
        }
        return (int)sqrt;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(512));
    }
}