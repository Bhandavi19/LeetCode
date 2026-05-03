class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int l=0;
        int i=0;
        int r = n-1;
        while(i<=r){
            if(nums[i] == 0){
                int temp = nums[l];
                nums[l] = nums[i];
                nums[i] = temp;
                l++;
                i++;
            }
            else if(nums[i] == 1){
                i++;
            }
            else{
                int temp = nums[i];
                nums[i] = nums[r];
                nums[r] = temp;
                r--;
            }
        }
    }
}