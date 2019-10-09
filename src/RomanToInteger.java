import java.util.HashMap;
import java.util.Scanner;

class RomanToInteger {
    class Solution {
        int getInt(Character character)
        {
            switch (character){
                case 'I': return 1;
                case 'V': return 5;
                case 'X': return 10;
                case 'L': return 50;
                case 'C': return 100;
                case 'D': return 500;
                case 'M': return 1000;
                default: return 0;
            }
        }
        public int romanToInt(String s) {
            int res = 0;
            int c;
            int p = 0;
            for (int i = s.length() - 1; i >= 0; i--){
                c = getInt(s.charAt(i));
                if(p <= c)
                    res += c;
                else
                    res -= c;
                p = c;
            }
            return res;
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        while(!s.equals(" ")) {
            System.out.println(new RomanToInteger().new Solution().romanToInt(s));
            s = in.nextLine();
        }
    }
}



