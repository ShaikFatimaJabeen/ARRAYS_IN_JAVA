import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter target sum: ");
        int target = sc.nextInt();
        
        // Call the twoSum function and print the result
        findTwoSum(arr, target);
        sc.close();
    }

    private static void findTwoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("Indices of the two numbers: " + i + ", " + j);
                    return; // Exit after finding the first pair
                }
            }
        }
        System.out.println("No two sum solution found.");
    }
}