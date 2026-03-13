import java.util.*;

class Solution {
    public List<String> commonChars(String[] words) {
        
        HashMap<Character,Integer> hm = new HashMap<>();
        List<String> res = new ArrayList<>();

        String st = words[0];

        for(int i=0;i<st.length();i++){
            hm.put(st.charAt(i), hm.getOrDefault(st.charAt(i),0) + 1);
        }

        for(int i=1;i<words.length;i++){

            String s = words[i];
            HashMap<Character,Integer> temp = new HashMap<>();

            for(int j=0;j<s.length();j++){
                temp.put(s.charAt(j), temp.getOrDefault(s.charAt(j),0) + 1);
            }

            for(char c : new HashSet<>(hm.keySet())){
                hm.put(c, Math.min(hm.get(c), temp.getOrDefault(c,0)));
            }
        }

        for(char c : hm.keySet()){
            int count = hm.get(c);

            while(count > 0){
                res.add(String.valueOf(c));
                count--;
            }
        }

        return res;
    }
}