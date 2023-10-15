import java.util.*;

public class Fibonacci{
    private int fib(int n){
        if(n==1 || n==0)
            return 1;
        return fib(n-1) + fib(n-2);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Fibonacci obj = new Fibonacci();

        System.out.println("Enter term number:");
        int n = sc.nextInt();
        System.out.println(obj.fib(n));
    }
}