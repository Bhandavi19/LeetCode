class Solution {
    public String[] findWords(String[] words) {
        Set<Character> h1 = new HashSet<>(Arrays.asList(
            'q','w','e','r','t','y','u','i','o','p'
        ));
        Set<Character> h2 = new HashSet<>(Arrays.asList(
            'a','s','d','f','g','h','j','k','l'
        ));
        Set<Character> h3 = new HashSet<>(Arrays.asList(
            'z','x','c','v','b','n','m'
        ));

        ArrayList<String> res = new ArrayList<>();

        for (String w : words) {
            String ch = w.toLowerCase();

            Set<Character> t;
            char a = ch.charAt(0);

            if (h1.contains(a)) t = h1;
            else if (h2.contains(a)) t = h2;
            else t = h3;

            boolean v = true;

            for (char b : ch.toCharArray()) {   // also fix type here
                if (!t.contains(b)) {
                    v = false;
                    break;
                }
            }

            if (v) res.add(w);   // ✅ fixed
        }

        return res.toArray(new String[0]);
    }
}