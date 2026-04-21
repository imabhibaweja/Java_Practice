import java.util.*;
public class linearSearch {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int size = s.nextInt();
        System.out.print("Enter an interger array:");
        int arr[] = new int[size];
        for(int i =0;i<size;i++){
            arr[i] = s.nextInt();
        }
        System.out.print("Enter number to be find: ");
        int search = s.nextInt();
        int position =-1;
        for(int i= 0;i<size;i++){
            if(arr[i]==search){
                position=i+1;
                break;
            }
        }
        System.out.println("number is found at position: "+position);
    }
}