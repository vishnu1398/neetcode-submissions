class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] inc = new int[n];
        int[] dec = new int[n];

        for(int i=0; i<n; i++)
        {
            if(i == 0)
                inc[i] = nums[i];
            else
                inc[i] = nums[i] * inc[i-1];
        }

        for(int i=n-1; i>=0; i--)
        {
            if(i == n-1)
                dec[i] = nums[i];
            else
                dec[i] = nums[i] * dec[i+1];
        }

        int[] result = new int[n];
        for(int i=0; i<n; i++)
        {
            if(i == 0)
                result[i] = dec[i+1];
            else if(i == n-1)
                result[i] = inc[i-1];
            else
            {
                result[i] = inc[i-1] * dec[i+1];
            }
        }

        return result;
    }
}  