//package Day2;

import java.util.Scanner;

public class AngleValidBasedSideOrAngle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the three traingle");
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();
        int angle3 = sc.nextInt();
        System.err.println("enter the side of traingle");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
        if(angle1 + angle2 + angle3 == 180 )
            System.out.println("angles  are traingle");
          
        else if(side1+side2 > side3 && side2+side3 > side1 && side1+side3 > side2 )
            System.out.println("sides are trainle");
       
        else 
            System.out.println("angles and sides are not traingle");
    }
}
