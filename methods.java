import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n: ");
        long n = s.nextLong();
        System.out.print("Enter r: ");
        long r = s.nextLong();
        System.out.println("Binomial cofficient of "+ n + " and " + r +" is "+ binomial(n,r));
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
}
