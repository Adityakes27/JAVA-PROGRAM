
    import java.util.Scanner;
     public class NthTermOfFibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        if(n == 1){
            System.out.println("nth term = " +a);
    }
        else if( n == 2){
            System.out.println("nth term = " +b);
        }
        else{
        for(int i=3;i<=n;i++){
           
         int next = a + b;
         a = b;
         b = next;
         
        }
        System.out.println("nth term = "+b);
        }
}

}
