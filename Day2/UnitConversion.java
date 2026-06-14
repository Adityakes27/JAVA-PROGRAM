//package Day2;

import java.util.Scanner;

public class UnitConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.err.println("enter the value to convert meter");
        double cm = sc.nextDouble();
        double meter = cm/100;
        System.out.println(cm + " cm = " + meter + " m");
        System.err.println("enter the value to convert gram");
        double kg = sc.nextDouble();
        double gram = kg/100;
        System.out.println(kg + " kg = " + gram + " gm");
        

    }
}
