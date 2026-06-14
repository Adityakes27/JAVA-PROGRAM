/* 
        *       i=1 sp=4 str=1 (2*i-1)
       * *      i=2 sp=3 str=3
      *   *     i=3 sp=2 str=5
     *     *    i=4 sp=1 str=7
    *********   i=5 sp=0 str=9
*/

import java.util.Scanner;

public class HollowPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of rows");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            //print spaces
           for(int j=i;j<n;j++){
            System.out.print(" ");
           }
           //print star and spaces
            for(int k=1;k<=(2*i-1);k++){
                if(k==1 || k==(2*i-1) || i==n){
             System.out.print("*");
                }
                else
                    System.err.print(" ");
            }
           System.out.println();
        }
    }
    
}
