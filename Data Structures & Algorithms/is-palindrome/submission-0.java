class Solution {
    public boolean isPalindrome(String s) {
        
        String plainText = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        //System.out.println(plainText);
        return check(plainText.toCharArray());
    }

    public boolean check(char[] ch)
    {
        int start = 0, end = ch.length-1;
        while(start < end)
        {
            if(ch[start] != ch[end])
                return false;
            start++;
            end--;
        }
        return true;
    }
}
