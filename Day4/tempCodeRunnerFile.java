import java.util.Scanner;

public class DuplicateElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements of the the array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int temp[] = new int[n];
        int j = 0;
        temp[j++] = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i] != arr[i - 1]){
            temp[j++] = arr[i];
        }
    }
    System.out.println("array after removing duplicats");
       for(int i=0;i<j;i++){
        System.out.println(temp[i] + " ");
       }
    }
}
