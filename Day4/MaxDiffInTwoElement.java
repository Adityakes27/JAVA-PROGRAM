import java.util.Scanner;

public class MaxDiffInTwoElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int largest = arr[0];
        int smallest = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        int difference = largest - smallest ;
        System.out.println(difference);
    }
}
