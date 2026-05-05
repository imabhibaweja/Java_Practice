public class reverseArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        printArray(a);
        reverse(a);
        printArray(a);
    }
    public static void reverse(int a[]){
        int front =0;
        int last = a.length-1;
        while(front<last){
            int temp=a[front];
            a[front]=a[last];
            a[last]=temp;
            front++;
            last--;
        }
    }
    public static void printArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
