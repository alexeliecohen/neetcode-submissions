class Solution {
       public boolean isAnagram(String s, String t) {
        return getCollect(s).equals(getCollect(t));
    }

    private List<String> getCollect(String s) {
        return s.chars().sorted()
                .mapToObj(Character::toString)
                .collect(Collectors.toList());
    }    
}
