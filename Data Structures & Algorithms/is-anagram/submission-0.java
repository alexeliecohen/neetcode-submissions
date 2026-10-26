class Solution {
       public boolean isAnagram(String s, String t) {
        return getCollect(s).equals(getCollect(t));
    }

    private String getCollect(String s) {
        return s.codePoints()
                .boxed()
                .sorted(Comparator.comparing(Character::toLowerCase))
                .map(Character::toString)
                .collect(Collectors.joining());
    }
}
