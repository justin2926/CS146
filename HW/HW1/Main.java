public class Main {
    public static void main(String[] args) {
        String a = "racecar";
        String b = "le@v()el";
        String c = "not a palindrome";

        System.out.println(isPalindrome(a));
        System.out.println("Exptected: true\n");

        System.out.println(isPalindrome(b));
        System.out.println("Expected: true\n");

        System.out.println(isPalindrome(c));
        System.out.println("Expected: false");

    }

    public static boolean isPalindrome(String s) {
        String lc = s.toLowerCase();
        String z = lc.replaceAll("[^a-zA-Z0-9]","");
        String reversed = "";
        boolean p = false;

        for (int i = 0; i < z.length(); i++) {
            reversed = z.charAt(i) + reversed;
        }

        if (z.equals(reversed)) {
            p = true;
        } else {
            p = false;
        }

        return p;
    }

}
