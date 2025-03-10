import java.util.*;

class Main {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
            List<List<Integer>> Pset = new ArrayList<>();
            Arrays.sort(nums);
            subset(nums, 0, new ArrayList<>(), Pset);
            return Pset;
        }

    public void subset(int[] nums, int start, List<Integer> list, List<List<Integer>> Pset) {
            Pset.add(new ArrayList<>(list));

            for (int i = 0; i < nums.length; i++) {
                if (i > start && nums[i] == nums[i - 1]) continue;

                list.add(nums[i]);
                subset(nums, i + 1, list, Pset);
                list.remove(list.size() - 1);
            }
        }


    public static void main(String[] args) {

    }
}