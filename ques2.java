import java.util.Scanner;
public class ques2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Annual Income(in Lakh):");
        float income=s.nextFloat();
        if(income<5)
            System.out.println("You don't need to pay any tax");
        else if(income > 5 && income<10)
                System.out.println("Total Tax amount to be pay is "+(0.2f*income));
        else
            System.out.println("Total Tax amount to be pay is "+(0.3f*income));
    }
}
