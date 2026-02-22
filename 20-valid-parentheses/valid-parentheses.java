import java.util.Stack;

class Solution {

    public static boolean isbalanced(String s){
        Stack<Character> st = new Stack<>();
        int n = s.length();

        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);

            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }
            else if(ch == ')' || ch == ']' || ch == '}'){
                if(st.isEmpty() || !match(st.pop(), ch)){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public boolean isValid(String s) {
        return isbalanced(s);
    }

    public static boolean match(char o, char c){
        return (o == '(' && c == ')') ||
               (o == '[' && c == ']') ||
               (o == '{' && c == '}');
    }
}