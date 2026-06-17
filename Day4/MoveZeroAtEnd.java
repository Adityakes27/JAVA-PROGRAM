import java.util.Scanner;

public class MoveZeroAtEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements of the array");
        for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
        }
      int j = 0;
      //move non zero at the end
      for(int i=0;i<n;i++){
        if(arr[i] != 0){
            arr[j] = arr[i];
            j++;
        }
      }
      //fill remaining position with zero
      while(j < n){
        arr[j] = 0;
        j++;
      }
      System.out.println("array after moving zero at the end");
      for(int i=0;i<n;i++){
          System.out.print(arr[i] + " ");
      }
    }
}
