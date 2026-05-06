class Solution {
    public int maxProfit(int[] arr) {
        int minprice = Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<minprice){
                minprice = arr[i];
            }
            else{
                profit = Math.max(profit,arr[i]-minprice);
            }
        }
        return profit;
    }
}