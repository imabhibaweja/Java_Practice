import java.util.*;

public class methods {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //System.out.print("Enter n: ");
        // long n = s.nextLong();
        // System.out.print("Enter r: ");
        // long r = s.nextLong();
        // System.out.println("Binomial cofficient of "+ n + " and " + r +" is "+ binomial(n,r));
        // int a = s.nextInt();
        // boolean result = isPrime1(a);
        // boolean result = isPrime2(a);
        // if(result)
        //     System.out.println("Its a prime number");
        // else
        //     System.out.println("its not a prime number");
        System.out.print("Enter start and ending number of range respectively: ");
        int a = s.nextInt();
        int b = s.nextInt();
        primesInRange(a, b);
        
    }
    public static long fact(long a){
        long n=1;
        while (a>0){
            n*=a;
            a--;
        }
        return n;
    }
    public static long binomial(long n, long r){
        long result;
        long fact_n = fact(n);
        long fact_r = fact(r);
        long fact_nr = fact(n-r);
        result = fact_n/(fact_nr * fact_r);
        return result;
    }
    public static boolean isPrime1(int a){
        boolean result = true;
        for(int i=2;i<a;i++){
            if(a%i==0){
                result = false;
                break;
            }
        }
        return result;
    }
    public static boolean isPrime2(int a){
         boolean result = true;
        for(int i=2;i<Math.sqrt(a);i++){
            if(a%i==0){
                result = false;
                break;
            }
        }
        return result;
    }
    public static void primesInRange(int a, int b){
        for(int i=a; i<=b;i++){
            if(isPrime2(i)){
                System.out.println(i+" is a prime number");
            }
        }
    }
}
