import java.util.Arrays;

public class thrSum {
    public static void main(String[] args) {

    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> n = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0 && (i != j && i != k && j != k)) {
                        List<Integer> m = new ArrayList<>(3);
                        m.add(nums[i]);
                        m.add(nums[j]);
                        m.add(nums[k]);
                        n.add(m);
                    }
                }
            }
        }
        return n;
    }
}
