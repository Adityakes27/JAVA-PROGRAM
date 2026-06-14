//package Day2;

import java.util.Scanner;

public class VowelOrConsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a character");
        char ch = sc.next().charAt(0);
        if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || 
           ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
           System.out.println("character is VoWel " +ch);
        else
            System.out.println("character is Consonent " +ch);
    }
}
