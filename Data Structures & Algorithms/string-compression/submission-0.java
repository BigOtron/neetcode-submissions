class Solution {
    public int compress(char[] chars) {
        int write = 0;
        int read = 0;

        while (read < chars.length) {
            char current = chars[read];
            int groupStart = read;

            // Advance read to the end of the current group
            while (read < chars.length && chars[read] == current) {
                read++;
            }
            int count = read - groupStart;

            // Write the character
            chars[write++] = current;

            // Write the count only if it's greater than 1
            if (count > 1) {
                for (char digit : Integer.toString(count).toCharArray()) {
                    chars[write++] = digit;
                }
            }
        }
        return write;
    }
}