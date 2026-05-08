public class maxSubarray{
    public static void main(String[] args) {
        int a[] = {1,-2,3,-5,6};
        int curSum;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[a.length];
        prefix[0]=a[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+a[i];
        }
        for(int i=0;i<a.length-1;i++){
            for(int j=i;j<a.length;j++){
                // curSum=a[i];
                // System.out.print("("+a[i]);
                // for(int k=i+1;k<=j;k++){
                //     System.out.print(","+a[k]);
                //     curSum+=a[k];
                // }
                // System.out.print(")");
                if(i==0){
                    curSum = prefix[j];
                }
                else{
                    curSum = prefix[j]-prefix[i-1];
                }
                if(curSum>maxSum)
                    maxSum=curSum;
            }

            // System.out.println();
        }
        System.out.println("Maximum sum is "+ maxSum);
       
    }
}