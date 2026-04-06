import java.util.Scanner;
public class conditional {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int day;
        System.out.println("enter number of day:");
        day = s.nextInt();

        //if-else
        if(day == 1)
            System.out.println("Monday");
        else if(day == 2)
            System.out.println("Tuesday");
        else if(day == 3)
            System.out.println("Wednesday");
        else if(day == 4)
            System.out.println("Thursday");
        else if(day == 5)
            System.out.println("Friday");
        else if(day == 6)
            System.out.println("Saturday");
        else
            System.out.println("Sunday");

        //ternary operators
        String d =  (day == 1)?"Monday":
                    (day == 2)?"Tuesday":
                    (day == 3)?"Wednesday":
                    (day == 4)?"Thursday":
                    (day == 5)?"Friday":
                    (day == 6)?"Saturday": "Sunday";
        System.out.println(d);

        // Swtich case
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            
            case 2: 
                System.out.println("Tuesday");
                break;
        
            case 3:
                System.out.println("Wednesday");
                break;
            
            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;
            
            case 6:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Sunday");
                break;
        }
        

    }
}