class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int start = 0, end = 0, maxLen = 0, zeroes = 0;
        while(end < nums.length)
        {
            if(nums[end] == 0)
                zeroes++;
            while(zeroes > 1)
            {
                if(nums[start] == 0)
                    zeroes--;
                start++;
            }
            if(zeroes <= 1)
                maxLen = Math.max(maxLen, end-start+1);           
            end++;
        }
        return maxLen;
    }
}
