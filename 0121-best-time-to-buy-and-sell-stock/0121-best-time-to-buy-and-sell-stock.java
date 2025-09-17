class Solution {
    public int maxProfit(int[] price) {

        //==========solution 1===============
        // int profit=0;
        // int min=price[0];
        // for(int i=0;i<price.length;i++){
        //     min=Math.min(min,price[i]);
        //     profit=Math.max(profit,price[i]-min);
        // }
        // return profit;


        //==========solution 2=============
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<price.length;i++){
            if(price[i]<minPrice){
                minPrice=price[i];

            }else if(price[i]-minPrice >maxProfit){
                maxProfit=price[i]-minPrice;

            }
        }
        return maxProfit;

    }
}
