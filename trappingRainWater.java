public class trappingRainWater {
    public static void main(String[] args) {
        int a[]={4,2,0,6,3,2,5};
        int width =1;
        int water=rainWater(a, width);
        System.out.println("Total water trapped is "+ water);
    }
    public static int rainWater(int a[], int w){
        int leftMax[]=new int[a.length];
        leftMax[0]=a[0];
        for(int i =1;i<a.length;i++){
            leftMax[i]=Math.max(leftMax[i-1], a[i]);
        }
        int rightMax[]=new int[a.length];
        rightMax[a.length-1]=a[a.length-1];
        for(int i=(a.length-2);i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1], a[i]);
        }
        int trappedWater=0;
        for(int i=0;i<a.length;i++){
            int waterLevel=Math.min(leftMax[i], rightMax[i]);
            trappedWater+=(waterLevel-a[i])*w;
        }
        return trappedWater;
    }
}
