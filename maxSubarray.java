public class maxSubarray{
    public static void main(String[] args) {
        int a[] = {1,-2,3,-5,6};
        bruteForce(a);
        
    }
    public static void bruteForce(int a[]){
        int curSum;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                curSum=a[i];
                System.out.print("("+a[i]);
                for(int k=i+1;k<=j;k++){
                    System.out.print(","+a[k]);
                    curSum+=a[k];
                }
                System.out.print(")");
                if(curSum>maxSum)
                    maxSum=curSum;
            }

            System.out.println();
        }
        System.out.println("Maximum sum is "+ maxSum);
       
    }
    
}