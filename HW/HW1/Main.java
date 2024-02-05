import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] x = {3, 1, 9};
        int[] y = {1, 7, 3, 2, 11};
        int[] z = {3, 2};

        System.out.println(Arrays.toString(twoSum(x, 12)));
        System.out.println("Expected output: [0, 2]\n");

        System.out.println(Arrays.toString(twoSum(y, 9)));
        System.out.println("Expected output: [1, 3]\n");

        System.out.println(Arrays.toString(twoSum(z, 5)));
        System.out.println("Expected output: [0, 1]\n");
    }

    public static int[] twoSum(int[] n, int k) {
        int[] s = new int[2];

        for (int i = 0; i < n.length; i++) {
            for (int j = i + 1; j < n.length; j++) {
                if (n[i] + n[j] == k) {
                    s[0] = i;
                    s[1] = j;
                }
            }
        }

        return s;
    }

}