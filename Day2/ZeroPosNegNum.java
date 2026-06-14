//package Day2;
import java.util.*;
public class ZeroPosNegNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if(n>0){
            System.out.println("number is potitive " + n);
        }
        else if(n<0){
            System.out.println("number is negative " + n);
        }
        else{
            System.err.println("number is zero " + n);
        }
    }
}
