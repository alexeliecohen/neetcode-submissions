class Solution {
    public String encode(List<String> str) {
        StringBuilder sb = new StringBuilder();
        if (str.size() == 0) {
            return "";
        }
        for (String s : str) {
            sb.append(String.format("%s#%d#", s.isEmpty() ? " " : s, s.length()));
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        return str.isBlank() ?
                List.of() :
                Arrays.stream(str.split("#\\d+#"))
                        .map(s -> s.equals(" ") ? "" : s)
                        .toList();

    }
}
