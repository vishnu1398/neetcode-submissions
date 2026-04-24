class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int candidate1 = 0, candidate2 = 0, vote1 = 0, vote2 = 0;

        for(int value : nums)
        {
            if(value == candidate1)
                vote1++;
            else if(value == candidate2)
                vote2++;
            else if(vote1 == 0)
            {
                candidate1 = value;
                vote1++;
            }
            else if(vote2 == 0)
            {
                candidate2 = value;
                vote2++;
            }
            else
            {
                vote1--;
                vote2--;
            }
        }

        int count1 = 0, count2 = 0;
        for(int value : nums)
        {
            if(value == candidate1)
                count1++;
            else if(value == candidate2)
                count2++;
        }
        int n = nums.length;
        if(count1 > n/3)
            result.add(candidate1);
        if(count2 > n/3)
            result.add(candidate2);
        return result;
    }
}