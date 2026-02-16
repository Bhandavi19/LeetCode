class Solution {
    public String reverse(int a){
        String ans = "";
        while(a>0){
            int x = a%2;
            ans = x+ans;
            a/=2;
        }
        while (ans.length() < 32) {
            ans = "0" + ans;
        }
        return ans;
    }
    public int reverseBits(int n) {
        String s = reverse(n);
        StringBuilder sb = new StringBuilder(s);
        int l = 0;
        int r = sb.length()-1;
        while(l<=r){
            char temp = sb.charAt(l);
            sb.setCharAt(l, sb.charAt(r));   
            sb.setCharAt(r, temp);
            l++;
            r--;
        }
        int ans = 0;
        int  power = 1;
        for(int i=sb.length()-1;i>=0;i--){
            int b = sb.charAt(i) - '0';
            ans += b*power;
            power *= 2;
        }
        return ans;
    }
}