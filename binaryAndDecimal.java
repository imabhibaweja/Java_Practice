import java.util.*;
public class binaryAndDecimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(" Enter any binary number: ");
        long n = s.nextLong();
        System.out.println("Decimal form:"+ binaryToDecimal(n));
        
    }
    public static long binaryToDecimal(long a){
        long result = 0;
        int i=0;
        while(a>0){
            long n=a%10;
            result=result+((int)Math.pow(2, i)*n);
            i++;
            a/=10;
        }
        return result;
    }
}
