public class fib {
    public static void main(String[] args) {
        System.out.println(fibRecursive(10));
        System.out.println("Expected: 55");
    }

    public static int fibRecursive(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }
}