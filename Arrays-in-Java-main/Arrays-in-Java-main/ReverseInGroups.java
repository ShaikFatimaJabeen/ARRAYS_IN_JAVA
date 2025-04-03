import java.util.*;

public class ReverseInGroups {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        System.out.print("Enter group size k: ");
        int k = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i += k) {
            int left = i, right = Math.min(i + k - 1, n - 1);
            while (left < right) {
                int temp = arr[left];
                arr[left++] = arr[right];
                arr[right--] = temp;
            }
        }
        System.out.println("Array after reversing in groups: " + Arrays.toString(arr));
        sc.close();
    }
}