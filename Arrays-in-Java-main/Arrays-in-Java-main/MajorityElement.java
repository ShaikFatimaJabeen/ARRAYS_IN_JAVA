import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int majorityElement = findMajorityElement(arr);
        System.out.println("Majority Element: " + majorityElement);
        sc.close();
    }
    

    private static int findMajorityElement(int[] arr) {
        int count = 0, candidate = -1;
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
       
    }
}