class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int ans = 0;
        int a = 0;
        int max = Integer.MAX_VALUE;
        for(int b=0;b<nums.size();b++){
            ans += nums.get(b);
            while(b-a+1 > r){
                ans -= nums.get(a);
                a++;
            }
            int tempans = ans;
            int temp = a;
            while(b-temp+1 >= l ){
                if(tempans > 0){
                    max = Math.min(max,tempans);
                }
                tempans -= nums.get(temp);
                temp++;
            }
        }
        return max == Integer.MAX_VALUE ? -1 : max;
    }
}