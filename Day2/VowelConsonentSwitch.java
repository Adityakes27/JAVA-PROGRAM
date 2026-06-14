//package Day2;

import java.util.Scanner;

public class VowelConsonentSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a character");
        char ch = sc.next().charAt(0);
        switch (ch) {
            case  'A':
            case  'a':   
            case  'E':
            case  'e':   
            case  'I':
            case  'i':  
            case  'O':
            case  'o':   
            case  'U':
            case  'u':
                System.out.println("character is vowel "+ ch);
                break;
        
            default:
                System.out.println("character is consonent "+ ch);
                break;
        }
    }
}
