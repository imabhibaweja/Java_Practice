import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number");
        long a = s.nextInt();
        System.out.println("Factorial of "+ a +" is "+ fact(a));
    }
    public static long fact(long a){
        long n=1;
        while (a>0){
            n*=a;
            a--;
        }
        return n;
    }
}
