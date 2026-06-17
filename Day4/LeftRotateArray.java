import java.util.Scanner;

public class LeftRotateArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter d:");
        int d = sc.nextInt();

        int temp[] = new int[n];

        for(int i = 0; i < n; i++) {
            temp[i] = arr[(i + d) % n];
        }

        System.out.println("Array after left rotation:");

        for(int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}