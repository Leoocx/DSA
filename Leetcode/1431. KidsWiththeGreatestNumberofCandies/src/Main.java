import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int aux=0;

        for (int candy: candies){
            aux = Math.max(candy,aux);
        }
        for (int candy: candies){
            result.add(candy+extraCandies >= aux);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] test = {12,1,12};
        kidsWithCandies(test,10);
    }
}