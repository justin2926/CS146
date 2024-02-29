public class LongestPalindrome {
    public static void main(String[] args) {
        LongestPalindrome lp = new LongestPalindrome();
        System.out.println(lp.longestPalindrome("abccccdd"));
        System.out.println("Expected: 7\n");

        System.out.println(lp.longestPalindrome("speediskey"));
        System.out.println("Expected: 5");
    }

    public int longestPalindrome(String s) {
        String lc = s.toLowerCase();
        String z = lc.replaceAll("[^a-zA-Z0-9]","");
        String b = z.replace(" ", "");

        int[] arr = new int[128];

        for (char c : b.toCharArray()) {
            arr[c]++;
        }

        int length = 0;
        boolean odd = false;

        for (int c : arr) {
            length += (c / 2) * 2;
            if (c % 2 != 0) {
                odd = true;
            }
        }


        if (odd) {
            length++;
        }

        return length;
    }


}
