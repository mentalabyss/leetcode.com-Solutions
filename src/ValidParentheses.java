import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    class Solution {

        Map<Character, Character> map = new HashMap<>();

        public Solution(){
            map.put(')', '(');
            map.put(']', '[');
            map.put('}', '{');
        }

        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();

            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);

                if(map.containsKey(c)){
                    char top = stack.empty()? ' ' : stack.pop();

                    if(map.get(c) != top)
                        return false;
                }

                else
                    stack.push(map.get(c));
            }

            return stack.empty();
        }
    }
}
