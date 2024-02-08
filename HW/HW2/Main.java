public class Main {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(4));
    }

    public static boolean isBadVersion(int x) {
        return x == 4 || x == 5 || x == 6;
    }

    public static int firstBadVersion(int n) {
        int first = 1;
        int last = n;

        while (first < last) {
            int mid = (first + last) / 2;
            if (isBadVersion(mid)) {
                last = mid;
            } else {
                first = mid+1;
            }
        }
        return first;
    }
}