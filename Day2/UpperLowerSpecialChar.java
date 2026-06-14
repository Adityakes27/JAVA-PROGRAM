//package Day2;

import java.util.Scanner;

public class UpperLowerSpecialChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter character");
        char ch = sc.next().charAt(0);
        if( ch >= 'A' && ch <= 'Z')
            System.out.println("Uppercase");
        else if( ch >= 'a' && ch <= 'z')
            System.out.println("Lowercase");
        else if( ch >= '0' && ch <='9')
            System.out.println("digit");
        else
            System.out.println("Special Character");
    }
}
