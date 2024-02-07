import java.util.Arrays;
public class Main {
    public static void main(Stringp[] args) {
        System.out.println(isBadVersion(4));
        System.out.println(isBadVersion(3));
        System.out.println(isBadVersion(5));
        System.out.println(isBadVersion(6));
    }

    public static boolean isBadVersion(int v) {

        int[] versions = [1, 2, 3, 4, 5, 6, 7];
        int badVersion = 4;

        if (Arrays.binarySearch(versions, badVersion)) {
            return true;
        }

        return false;
    }
}