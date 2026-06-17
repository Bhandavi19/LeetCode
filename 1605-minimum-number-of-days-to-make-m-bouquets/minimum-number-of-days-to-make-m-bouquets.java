class Solution {
    
    public boolean possible(int arr[] , int day , int m ,int k){
        int n=arr.length;
        int flow=0;
        int total = 0;
        for(int i=0;i<n;i++){
            if(arr[i] <= day){
                flow++;
                if(flow == k){
                    total++;
                    flow=0;
                }
            }
            else{
                flow=0;
            }
        }
        return total >= m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if(n<(long)m*k) return -1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            min=Math.min(min,bloomDay[i]);
            max=Math.max(max,bloomDay[i]);
        }
        int l=min;
        int h=max;
        while(l<h){
            int mid=l+(h-l)/2;
            if(possible(bloomDay , mid , m , k)){
                h=mid;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
}