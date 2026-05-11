class Solution {
    HashMap<Integer,Integer> hm = new HashMap<>();
    public int fib(int n) {
        if(hm.containsKey(n)){
            return hm.get(n);
        }
        if(n==0 || n==1){
            return n;
        }
        
        int sum = fib(n-1)+fib(n-2);
        hm.put(n , sum);
        return sum;
    }
}