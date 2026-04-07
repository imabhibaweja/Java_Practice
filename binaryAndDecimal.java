import java.util.*;
public class binaryAndDecimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(" Enter any Binary number: ");
        long n = s.nextLong();
        System.out.println("Decimal form:"+ binaryToDecimal(n));
        System.out.print(" Enter any decimal number: ");
        int n1 = s.nextInt();
        System.out.println("Binary Form: "+ DecimalToBinary(n1));
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
    public static long DecimalToBinary(int a){
        long result = 0;
        int i=0;
        while(a>0){
            long n=a%2;
            result=result+((int)Math.pow(10, i)*n);
            i++;
            a/=2;
        }
        return result;
    }
}
