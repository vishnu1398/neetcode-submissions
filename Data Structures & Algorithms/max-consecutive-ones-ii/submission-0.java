class Solution {
    public int maxLen = 0;
    public int findMaxConsecutiveOnes(int[] nums) {
        findMaxCon(nums, 0, 0, false);
        return maxLen;
    }

    public void findMaxCon(int[] nums, int index, int counter, boolean isFlipped) {
        if(index == nums.length)   
            return;
        if(nums[index] == 1)
        {
            maxLen = Math.max(maxLen, counter+1);
            findMaxCon(nums, index+1, counter+1, isFlipped);
        }
        else
        {
            findMaxCon(nums, index+1, 0, isFlipped);
            if(!isFlipped)
            {
                maxLen = Math.max(maxLen, counter+1);
                findMaxCon(nums, index+1, counter+1, !isFlipped);
            }              
        }
    }
}
