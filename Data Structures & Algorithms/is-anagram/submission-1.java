class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (!sMap.containsKey(a)) {
                sMap.put(a, 1);
            } else {
                int count = sMap.get(a);
                sMap.put(a, count+1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char a = t.charAt(i);
            if (!tMap.containsKey(a)) {
                tMap.put(a, 1);
            } else {
                int count = tMap.get(a);
                tMap.put(a, count+1);
            }
        }

        return sMap.equals(tMap);


    }
}
