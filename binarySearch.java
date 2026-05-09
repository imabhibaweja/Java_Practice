import java.util.*;
public class binarySearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size;
        System.out.print("Enter size of array:");
        size=s.nextInt();
        int a[]= new int[size];
        System.out.print("Enter eleements of array:");
        for(int i=0;i<size;i++){
            a[i]=s.nextInt();
        }
        System.out.print("Enter the elements to be searched:");
        int index = s.nextInt();
        System.out.println("Element is found at: "+ (binary(a, index)+1));
    }
    public static int binary(int a[], int index){
        int start = 0;
        int end = a.length-1;
        
        while(start<=end){
            int mid = (start+end)/2;
            if(a[mid]==index){
                return mid;
            }
            else if(a[mid]>index){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
}
}
