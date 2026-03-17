class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> l = new ArrayList<>();
        HashMap<Integer,Integer> hs = new HashMap<>();
        int n = nums.length;
        int m = nums[0].length;
        for(int i=0;i<n;i++){
            for(int num : nums[i]){
                hs.put(num , hs.getOrDefault(num,0)+1);
            }
        }
        for(int i : hs.keySet()){
            if(hs.get(i) == n){
                l.add(i);
            }
        }
        Collections.sort(l);
        return l;
    }
}