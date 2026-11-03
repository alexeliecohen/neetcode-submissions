class Solution {
    public int[] twoSum(int[] nums, int target) {
        int index = 0;
        for (int i = index+1; i < nums.length; i++) {
            if (nums[index] + nums[i] == target) {
                return new int[]{index, i};
            }
           if (i+1 == nums.length) {
                index++;
                i=index;
            }
        }
        return null;
    }
}