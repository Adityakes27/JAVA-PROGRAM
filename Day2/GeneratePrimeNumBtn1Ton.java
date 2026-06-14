//package Day2;


    
import java.util.Scanner;
public class GeneratePrimeNumBtn1Ton {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for(int num = 2; num <= n; num++) {

            boolean isPrime = true;

            for(int i = 2; i < num; i++) {
                if(num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
