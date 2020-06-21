import java.util.Scanner;

public class CountAndSay {
    class Solution {
        public String countAndSay(int n) {
            String f = "1";
            StringBuilder partRes = new StringBuilder();
            if(n == 1)
                return f;
            for(int i = 0; i < n - 1; i++){
                int j = 0;
                int count = 1;
                while(j < f.length()){
                    if(j+1 < f.length() && f.charAt(j) == f.charAt(j+1)){
                        count++;
                        j++;
                    }
                    else{
                        partRes.append(count).append(f.charAt(j));
                        count = 1;
                        j++;
                    }
                }
                f = partRes.toString();
                partRes = new StringBuilder();
            }

            return f;
        }
    }

    public static void main(String[] args){
        Solution solution = new CountAndSay().new Solution();
        System.out.println(solution.countAndSay(4));
    }
}
