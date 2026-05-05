public class pairs {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        printPairs(a);
    }
    public static void printPairs(int a[]){
        for(int i=0;i<=a.length-1;i++){
            for(int j=i+1;j<=a.length-1;j++){
                System.out.print("("+a[i]+","+a[j]+")"+",");
            }
            System.out.println();
        }
    }
}
