//package Day2;


  import java.util.Scanner;
public class FindNumAandB {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long a = 1;
        long b = 1;

        long temp = n;

        for(long p = 2; p * p <= temp; p++) {

            int count = 0;

            while(temp % p == 0) {
                count++;
                temp /= p;
            }

            int cubePart = count / 3;
            int remPart = count % 3;

            for(int i = 0; i < cubePart; i++) {
                a *= p;
            }

            for(int i = 0; i < remPart; i++) {
                b *= p;
            }
        }

        if(temp > 1) {
            b *= temp;
        }

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}  

