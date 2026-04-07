import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = s.nextInt();
        ispalindrome(n);
    }
    public static void ispalindrome(int n){
        int rev = reverse(n);
        if(n == rev)
            System.out.println("Its a palindrome");
        else
            System.out.println("Its not a palindrome");
    }
    public static int reverse(int n){
        int rev = 0;
        while(n>0){
            int r =n%10;
            rev= (rev*10)+r;
            n/=10;
        }
        return rev;
    }
}
