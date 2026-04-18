class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1)
            return strs[0];
        int minLen = Integer.MAX_VALUE;
        String str = "";
        for(String value : strs)
        {
            if(value.length() < minLen)
            {
                minLen = value.length();
                str = value;
            }
        }
        StringBuilder sb = new StringBuilder();
        boolean isValid = true;
        for(int i=0; i<str.length(); i++)
        {
            isValid = true;
            for(String value : strs)
            {
                if(value.charAt(i) != str.charAt(i))
                {
                    isValid = false;
                    break;
                }
            }
            if(isValid)
                sb.append(str.charAt(i));
            else
                break;
        }

        return sb.toString();
    }
}