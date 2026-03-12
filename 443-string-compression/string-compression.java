class Solution {
    public int compress(char[] chars) {
        ArrayList<Character> arr = new ArrayList<>();
        int n = chars.length;
        int i=0;
        int j=0;
        int cnt = 0;
        while(j<n){
            if(chars[i] == chars[j]){
                j++;
                cnt++;
            }
            else{
                arr.add(chars[i]);
                if(cnt>1){
                    String s = String.valueOf(cnt);
                    for(char c : s.toCharArray()){
                        arr.add(c);
                    }
                }
                i=j;
                cnt=0;
            }
        }
        arr.add(chars[i]);
        if(cnt>1){
            String s1 = String.valueOf(cnt);
            for(char c : s1.toCharArray()){
                arr.add(c);
            }
        }
        for(int k=0;k<arr.size();k++){
            chars[k] = arr.get(k);
        }
        return arr.size();
    }
}