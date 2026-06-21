import java.util.Scanner;

public class SubarrayWithGivenSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target sum:");
        int target = sc.nextInt();

        int start = 0;
        int currentSum = 0;
        boolean found = false;

        for(int end = 0; end < n; end++) {

            currentSum += arr[end];

            while(currentSum > target && start <= end) {
                currentSum -= arr[start];
                start++;
            }

            if(currentSum == target) {
                System.out.println("Subarray found from index "
                                   + start + " to " + end);
                found = true;
                break;
            }
        }

        if(!found) {
            System.out.println("No subarray found");
        }
    }
}
