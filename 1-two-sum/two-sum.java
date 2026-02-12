class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int arr[] = new int[2];
        for(int i=0;i<nums.length;i++){
            int temp = target - nums[i];
            if(hm.containsKey(temp)){
                arr[0] = hm.get(temp);
                arr[1] = i;
            }
            hm.put(nums[i] , i);
        }
        return arr;
    }
}