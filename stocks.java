public class stocks {
    public static void main(String[] args) {
        int a[]={7,1,5,3,6,4};
        System.out.println(profitStocks(a));
    }
    public static int profitStocks(int a[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<a.length;i++){
            if(buyPrice<a[i]){
                int profit = a[i]-buyPrice;
                maxProfit=Math.max(maxProfit, profit);
            }
            else{
                buyPrice=a[i];
            }
        }
        return maxProfit;
    }
}
