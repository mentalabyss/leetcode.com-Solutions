public class RemoveElement {
    class Solution {
        public int removeElement(int[] nums, int val) {
            int val_count = 0;

            for (int i = 0; i < nums.length - val_count; i++) {
                if (nums[i] == val) {
                    val_count++;
                    int j = i;
                    while (j + 1 < nums.length) {
                        nums[j] = nums[j+1];
                        j++;
                    }
                    i--;
                }
            }

            return nums.length - val_count;
        }
    }
}
