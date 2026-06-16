class Solution {
    public int hours(int a[] , int h){
        int total=0;
        for(int i=0;i<a.length;i++){
            total += Math.ceil(a[i]+h-1)/h;
        }
        return total;
    }
    public int minEatingSpeed(int[] arr, int h) {
        int n = arr.length;
        int ans=0;
        for(int i=0;i<n;i++){
            ans = Math.max(ans,arr[i]);
        }
        int l=1;
        int r=ans;
        int res = Integer.MAX_VALUE;
        int total=0;
        while(l<=r){
            int m = l+(r-l)/2;
            total = hours(arr , m);
            if(total <= h){
                res = m;
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        return l;
    }
}