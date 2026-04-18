class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1)
            return strs[0];

        String prefix = strs[0];
        for(int i=1; i<strs.length; i++)
        {
            while(prefix.length() > 0 && !strs[i].startsWith(prefix))
            {
                if(prefix.length() == 0)
                {
                    break;
                }
                prefix = prefix.substring(0, prefix.length() - 1);
            }
            if(prefix.length() == 0)
                break;
        }
        return prefix;
    }
}