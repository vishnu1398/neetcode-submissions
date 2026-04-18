class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0, votes = 0;
        for(int value : nums)
        {
            if(votes == 0)
            {
                candidate = value;
                votes = 1;
            }
            else
            {
                if(value == candidate)
                    votes++;
                else
                    votes--;
            }
        }

        int count = 0;
        for(int value : nums)
        {
            if(value == candidate)
                count++;
        }
        return count > (nums.length/2) ? candidate : 0;
    }
}