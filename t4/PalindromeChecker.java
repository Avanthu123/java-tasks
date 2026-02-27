package t4;

public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        String clean = str.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(clean).reverse().toString();
        return clean.equals(reversed);
    }

    public static void main(String[] args) {
        String word = "Racecar";
        System.out.println("Is '" + word + "' palindrome? " + isPalindrome(word));
    }
}
