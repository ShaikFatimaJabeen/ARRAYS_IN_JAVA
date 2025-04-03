import java.util.*;

public class BinarySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements (0s and 1s):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int zeroIndex = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[zeroIndex];
                arr[zeroIndex] = temp;
                zeroIndex++;
            }
        }
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        sc.close();
    }
}