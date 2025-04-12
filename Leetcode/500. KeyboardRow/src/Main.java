import java.util.ArrayList;

public class Main {


    public String[] findWords(String[] words) {
        ArrayList<String> arr = new ArrayList<>();
        String firstRow = "qwertyuiop";
        String secondRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";

        for (String s: words){
            if (contains(s,firstRow) || contains(s,secondRow) || contains(s,thirdRow)){
                arr.add(s);
            }
        }
        return arr.toArray(new String[0]);
    }

    public boolean contains(String s, String row){
        for (char c: s.toCharArray()){
            if (row.indexOf(Character.toLowerCase(c))==-1){
                return false;
            }
        } return true;
    }
}