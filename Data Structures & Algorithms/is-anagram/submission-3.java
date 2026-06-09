class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();


        for(Character c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

         for(Character c : t.toCharArray()){
            map.put(c,map.getOrDefault(c,0)-1);

            if (map.get(c) == 0) {
                map.remove(c); 
            }
        }

        if(map.size()==0)
            return true;

        return false;

    }
}
