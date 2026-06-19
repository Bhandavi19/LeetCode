class Solution {
    public int days(int arr[] , int m){
        int day = 1;
        int load = 0;
        for(int i=0;i<arr.length;i++){
            if(load+arr[i] > m){
                day = day+1;
                load = arr[i];

            }
            else{
                load += arr[i];
            }

        }
        return day;
    }
    public int shipWithinDays(int[] weights, int days) {
        int max=0;
        int ans = 0;
        int n = weights.length;
        for(int i=0;i<weights.length;i++){
            max = Math.max(max,weights[i]);
            ans+=weights[i];
        }
        int l=max;
        int r=ans;
        while(l<=r){
            int m=l+(r-l)/2;
            if(days(weights , m) <= days){
                r=m-1;

            }
            else{
                l=m+1;
            }
        }
        return l;
    }
}
//max capacity an be till the weights of all the weights in array