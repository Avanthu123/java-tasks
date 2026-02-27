package t4;
public class SecondLargestFinder {
    public static int find(int[] arr) {
        int f = Integer.MIN_VALUE, s = Integer.MIN_VALUE;
        for (int n : arr) {
            if (n > f) { s = f; f = n; }
            else if (n > s && n != f) s = n;
        }
        return s;
    }
    public static void main(String[] args) {
        int[] n = {10, 20, 5, 45, 30};
        System.out.println("Second Largest: " + find(n));
    }
}
