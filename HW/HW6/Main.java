public class Main {
    public static void main(String[] args) {

    }

    public List<List<Integer>> threeSum(int[] nums) {

        List<Integer> l = new ArrayList<Integer>();

       for (int i = 0; i < nums[i]; i++) {
           for (int j = i + 1; i j < nums[j]; j++) {
               for (int k = j + 1; k < nums[k]; k++) {
                   if (nums[i] + nums[j] + nums[k] == 0) {
                       l.add(i);
                       l.add(j);
                       l.add(k);
                   }
               }
           }
       }

    }

    return l.;
}