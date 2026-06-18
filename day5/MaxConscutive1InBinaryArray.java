//package day5;


import java.util.Scanner;

public class MaxConscutive1InBinaryArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of binay array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int count = 0;
        int max = 0;
        System.out.println("enter the binary array elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
       for(int i=0;i<arr.length;i++){
        if(arr[i] == 1){
            count++;
           if(count > max){
            max = count;
            }
        }
        else
        {
             count = 0;
        }
    }
        System.out.print(max);
       
    }
}
