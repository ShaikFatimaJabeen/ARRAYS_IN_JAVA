import java.util.HashMap;
import java.util.Scanner;

public class LongestSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.next();
        int length = lengthOfLongestSubstring(s);
        System.out.println("Length of Longest Substring Without Repeating Characters: " + length);
        sc.close();
    }

    private static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0, left = 0;

        for (int right = 0; right < s.length(); right++) {
            if (map.containsKey(s.charAt(right))) {
                left = Math.max(map.get(s.charAt(right)) + 1, left);
            }
            map.put(s.charAt(right), right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}