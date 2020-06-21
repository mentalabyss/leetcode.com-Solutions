public class LongestSubstringWithoutRepeatingCharacters {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            int max = 0;
            String added = "";
            for (int i = 0; i < s.length(); i++) {
                if (added.indexOf(s.charAt(i)) == -1) {
                    added += s.charAt(i);
                    if (added.length() > max)
                        max = added.length();
                }
                else
                    added = "";
            }

            return max;
        }
    }
}
