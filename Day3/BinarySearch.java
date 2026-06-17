//package Day3;

//public class BinarySearch {
    import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50, 60, 70};

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter element to search:");
        int key = sc.nextInt();

        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {

            int mid = (start + end) / 2;

            if(arr[mid] == key) {
                System.out.println("Element found at index " + mid);
                return;
            }

            if(key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        System.out.println("Element not found");
    }
}

