
/*
   ********* i=5 sp=0 str=9 (2*1-1)
    *     *  i=4 sp=1 str=7
     *   *   i=3 sp=2 str=5
      * *    i=2 sp=3 str=3
       *     i=1 sp=4 str=1

*/
import java.util.Scanner;

public class InvertedHollowPyramid {                                      

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of rows");
        int n = sc.nextInt();
        for(int i=n;i>=1;i--){
            //space print
            for(int j=n;j>=i;j--){
                System.out.print(" ");
            }  
                for(int k=1;k<=(2*i-1);k++){
                   // if(i == n || i == 1 || k == 1 || k ==(2*i-1)){
                        System.out.print("*");
                   // }
                   // else{
                       // System.out.print(" ");
                   // }
                }
            
            System.out.println();
        }
    }
}
