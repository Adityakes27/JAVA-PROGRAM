import java.util.*;
//Leader in array: An element is a Leader if it is greater than or equal to all the 
// elements to its right side.
public class LeaderInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of element in array : ");
        int n = sc.nextInt();
        System.out.print("Enter elements : ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Leader elements : ");
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = i+1; j < n; j++) {
                if(arr[i] < arr[j]) {
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
}