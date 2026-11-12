class Solution {

    public String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();
        for (String str : strs) {
            builder.append(str.length()).append("~").append(str);
        }
        return builder.toString();
    }

    public List<String> decode(String str) {
        List<String> output = new ArrayList<>();
        int index = 0;
        while (index < str.length()) {
            int x = str.indexOf("~", index);
            int y = Integer.parseInt(str.substring(index, x));
            String elem = str.substring(x+1, x+y+1);
            output.add(elem);
            index = x + 1 + y;
        }
        return output;
    }
}
