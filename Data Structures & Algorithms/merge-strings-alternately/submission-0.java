class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        int i = 0, j = 0;
        while(i < word1.length() && j < word2.length())
        {
            if(flag)
            {
                sb.append(word1.charAt(i));
                i++;
                flag = false;
            }
            else
            {
                sb.append(word2.charAt(j));
                j++;
                flag = true;
            }
        }

        if(i == word1.length())
        {
            while(j < word2.length())
            {
                sb.append(word2.charAt(j));
                j++;
            }
        }
        else
        {
            while(i < word1.length())
            {
                sb.append(word1.charAt(i));
                i++;
            }
        }

        return sb.toString();
        
    }
}