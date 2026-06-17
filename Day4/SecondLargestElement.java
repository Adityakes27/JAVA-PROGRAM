//package Day4;

import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int length = arr.length;
        for(int i=0;i<length;i++){
            for(int j=1;j<length-i;j++){
                if(arr[j-1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] =  temp;
                }
            }
        }
        //for(int i=0;i<length;i++){
        System.out.println("the second highest element of array = "+arr[n-2]);
       // System.out.print( arr[i] + " " );
        //}
    }
}
