import java.util.Scanner;

public class ReverseOfStringRecursion {
    static String reverse( String str){
        if(str.length() <= 1){
            return str;
        }
            else 
          return reverse(str.substring(1)) + str.charAt(0);
        }   
        

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String str = sc.nextLine();
        System.out.println("string after reverse = " + reverse(str));
    }
}
