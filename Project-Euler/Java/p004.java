public class p004 {

    public static int largestPalindromeProduct(){
        int maxResult = -1;

        for (int i=100; i<1000; i++){
            for (int j=100; j<1000; j++){
                if (Library.isPalindrome(i*j) && (i*j)>maxResult){
                    maxResult=i*j;
                }
            }
        }

        return maxResult;
    }



    public static void main(String[] args){
        System.out.print(largestPalindromeProduct());

    }


}
