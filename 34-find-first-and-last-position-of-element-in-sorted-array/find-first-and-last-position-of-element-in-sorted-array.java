class Solution {
    public int findfirst(int arr[],int t){
        int l=0;
        int r=arr.length-1;
        int ans=-1;
        while(l<=r){
            int m = l+(r-l)/2;
            if(arr[m] == t){
                ans = m;
                r=m-1;
            }
            else if(arr[m]<t){
                l=m+1;
            }
            else{
                r=m-1;
            }
        }
        return ans;
    }
    public int findlast(int arr[],int t){
        int l=0;
        int r=arr.length-1;
        int ans=-1;
        while(l<=r){
            int m = l+(r-l)/2;
            if(arr[m] == t){
                ans = m;
                l=m+1;
            }
            else if(arr[m]<t){
                l=m+1;
            }
            else{
                r=m-1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        ans[0] = findfirst(nums,target);
        ans[1] = findlast(nums,target);
        return ans;
    }
}