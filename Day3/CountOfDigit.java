import java.util.Scanner;

public class CountOfDigit {

    static int digitCount (int n){
        if(n < 10)
            return 1;
        else
            return  1 + digitCount(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        System.out.println("digitCount "+digitCount(n));
    }
}
