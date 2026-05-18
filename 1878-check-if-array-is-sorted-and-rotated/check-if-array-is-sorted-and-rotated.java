class Solution {
    public boolean check(int[] arr) {
        int n = arr.length;
        int c=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                c++;
            }
        }
        if(arr[n-1] > arr[0]){
            c++;
        }
        if(c<=1){
            
            return true;
        }
        return false;
    }
}