class Solution {
    public int minimumCost(int[] nums) {
        int sum = 0;
        if(nums.length == 3){
            return nums[0]+nums[1]+nums[2];
        }
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int i=1;i<nums.length;i++){
            if(nums[i] < first){
                second = first;
                first = nums[i];
            }
            else if(nums[i]<second){
                second = nums[i];
            }
        }
        return nums[0]+first+second;
    }
}