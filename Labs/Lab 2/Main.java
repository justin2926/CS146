import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(isAnagram("fried", "fired"));
        System.out.println("Expected: true\n");

        System.out.println(isAnagram("silent", "listen"));
        System.out.println("Expected: true\n");

        System.out.println(isAnagram("bread", "read"));
        System.out.println("Expected: false");
    }

    public static boolean isAnagram(String s, String t) {
        String lc = s.toLowerCase();
        String lc1 = t.toLowerCase();

        char[] a = lc.toCharArray();
        char[] b = lc1.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.toString(a).equals(Arrays.toString(b))) {
            return true;
        }
        return false;
    }
}