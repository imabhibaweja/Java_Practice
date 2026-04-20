import java.util.Scanner;

public class arrayBasics {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int marks[]=new int[5];
        System.out.print("ENter numbers of 5 subjects:");
        for(int i=0;i<5;i++){
            marks[i]=s.nextInt();
        }
        System.out.print("Marks of 5 subjects are: ");
        for(int i=0;i<5;i++){
            System.out.print(marks[i]+ " ");
        }
    }

}
