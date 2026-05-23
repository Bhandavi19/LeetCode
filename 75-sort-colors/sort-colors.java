class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int l=0;
        while(i<=j){
            if(nums[i] == 0){
                int temp = nums[i];
                nums[i] = nums[l];
                nums[l] = temp;
                i++;
                l++;
            }
            else if(nums[i] == 1){
                i++;
            }
            else{
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            }
        }

    }
}