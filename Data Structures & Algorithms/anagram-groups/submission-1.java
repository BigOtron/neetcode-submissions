class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> output = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if (!map.containsKey(key)) {
                List<String> group = new ArrayList<>();
                group.add(strs[i]);
                map.put(key, group);
            } else {
                map.get(key).add(strs[i]);
            }
        }
        for (List<String> groups : map.values()) {
            output.add(groups);
        }
        return output;
    }
}
