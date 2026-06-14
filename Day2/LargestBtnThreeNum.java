//package Day2;

import java.util.Scanner;

public class LargestBtnThreeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int n1 = sc.nextInt();
        System.out.println("Enter Second number");
        int n2 = sc.nextInt();
        System.out.println("Enter third number");
        int n3 = sc.nextInt();

        if(n1>n2 && n1>n3)
            System.out.println("first number is greatest "+n1);
        else if(n2>n1 && n2>n3)
            System.out.println("second number is greatest "+n2);
        else 
            System.out.println("third number is greatest " +n3);
}
}