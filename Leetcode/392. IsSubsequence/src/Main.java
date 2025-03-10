public class Main {

    public static boolean isSubsequence(String s, String t) {
        boolean result=false;
        int n = s.length();
        int m = t.length();
        int j=0;

        for (int i=0; i<m; i++){
            if (j==n){
                return true;
            }
            if (t.charAt(i)==s.charAt(j)){
                j++;
            }
        }
        result= j==n;
        return result;

    }



    public static void main(String[] args) {
        isSubsequence("abc","ahbgdc");
    }
}