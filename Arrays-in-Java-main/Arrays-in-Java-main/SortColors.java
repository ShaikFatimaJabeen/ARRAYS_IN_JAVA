import java.util.*;

public class SortColors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements (0s, 1s, and 2s):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int low = 0, mid = 0, high = n - 1;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    int temp0 = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp0;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    int temp2 = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp2;
                    high--;
                    break;
            }
        }
        System.out.println("Sorted Colors: " + Arrays.toString(arr));
        sc.close();
    }
}