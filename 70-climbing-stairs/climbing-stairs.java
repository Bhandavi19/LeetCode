class Solution {
    HashMap<Integer,Integer> hm = new HashMap<>();

    public int climbStairs(int n) {
        if(hm.containsKey(n)){
            return hm.get(n);
        }
        if(n==1 || n==2){
            return n;
        }
        
        int sum = climbStairs(n-1)+climbStairs(n-2);
        hm.put(n , sum);
        return sum;
        
    }
}