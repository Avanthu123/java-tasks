package t4;

import java.util.Arrays;

public class ArrayReverser {
    public static void reverse(int[] arr) {
        if (arr == null) return;
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Original Array: " + Arrays.toString(numbers));
        reverse(numbers);
        System.out.println("Reversed Array: " + Arrays.toString(numbers));
    }
}
