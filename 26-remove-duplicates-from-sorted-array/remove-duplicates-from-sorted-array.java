class Solution {
    public int removeDuplicates(int[] nums) {
        int r = 0;
        int i = 1;
        int n=nums.length;
        
        while(i<n){
            if(nums[r]!=nums[i]){
                nums[r+1] = nums[i];
                r++;
            }
            i++;
        }
        return r+1;
    }
}