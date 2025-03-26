import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public String clearDigits(String s) {
        StringBuilder sb= new StringBuilder(s);
        for (int i=0;i<sb.length();i++){
            int chrIndex = sb.charAt(i)-'0';
            if(chrIndex>=0 && chrIndex<=9){
                sb=sb.delete(i-1,i+1);
                i-=2;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

    }
}