class Solution {
    public boolean isAnagram(String s, String t) {
        int m = s.length();
        int n = t.length();

        HashMap<Character, Integer> map = new HashMap<>();

        for(Character ch : s.toCharArray())
        {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(Character ch : t.toCharArray())
        {
            if(map.containsKey(ch))
            {
                int freq = map.get(ch);
                if(freq == 1)
                    map.remove(ch);
                else
                    map.put(ch, freq-1);
            }
            else
                map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        return map.isEmpty();
    }
}
