//package Day2;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a year");
    int year = sc.nextInt();
    if(year % 400 == 0)
        System.out.println("This year is leap year");
    else if(year % 100 == 0)
        System.out.println("This year is not leap year");
    else if(year % 4 == 0)
        System.out.println("This year is leap year");
    else
        System.out.println("This year is not leap year");

}
}