class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> freqMapS = new HashMap<>();
        HashMap<Character, Integer> freqMapT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            freqMapS.put(sChar, freqMapS.getOrDefault(sChar, 0) + 1);
            freqMapT.put(tChar, freqMapT.getOrDefault(tChar, 0) + 1);
        }
        return freqMapS.equals(freqMapT);
    }
}
