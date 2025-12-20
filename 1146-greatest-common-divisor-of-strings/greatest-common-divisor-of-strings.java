class Solution {
    public int gcd(int a,int b){
        while(b!=0){
            int temp = a%b;
            a=b;
            b=temp;

        }
        return a;
    }
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        int len1 = str1.length();
        int len2 = str2.length();

        int g = gcd(len1,len2);
        return str1.substring(0,g);
    }
}