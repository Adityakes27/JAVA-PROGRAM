import java.util.Scanner;

public class MaxOrMinOfArrSizeK {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements of the array:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the size of subarray (K):");
        int k = sc.nextInt();

        //if(k > n || k <= 0) {
        //    System.out.println("Invalid value of K");
         //   return;
        //}

        int currentSum = 0;

        // First window sum
        for(int i = 0; i < k; i++) {
            currentSum += arr[i];
        }

        int maxSum = currentSum;
        int minSum = currentSum;

        // Sliding Window
        for(int i = 1; i <= n-k; i++) {

            currentSum = currentSum - arr[i - 1] + arr[i +k-1];

            if(currentSum > maxSum) {
                maxSum = currentSum;
            }

            if(currentSum < minSum) {
                minSum = currentSum;
            }
        }

        System.out.println("Maximum Subarray Sum = " + maxSum);
        System.out.println("Minimum Subarray Sum = " + minSum);
    }
}