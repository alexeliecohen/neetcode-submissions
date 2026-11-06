class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("\\s+|[^a-z0-9]", "");
        return new StringBuilder(s.substring(0, s.length() / 2))
                .reverse()
                .toString()
                .equals(s.substring((s.length() + 1) / 2));
    }
}
