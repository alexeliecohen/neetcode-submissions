class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        LinkedHashMap<String, ArrayList<String>> map = new LinkedHashMap<>();
        for (String s : strs) {
            String anagram = createAnagram(s);
            ArrayList<String> anagramList = map.get(anagram);
            if (anagramList == null) {
                map.put(anagram, new ArrayList<>(List.of(s)));
            } else {
                anagramList.add(s);
            }
        }
        return new ArrayList<>(map.values());
    }


    public String createAnagram(String s) {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        return Arrays.toString(charArray);
    }
}
