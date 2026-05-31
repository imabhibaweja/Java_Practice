public class sorting {


    // bubble sort function
    public static void bubbleSort(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

    }

    //print array
    public static void printArray(int a[] ){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String args[]) {
        int a[] = {5,2,1,6,7,0};
        bubbleSort(a);
        printArray(a);
    }
   
}
