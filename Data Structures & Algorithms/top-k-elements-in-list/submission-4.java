class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        final Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.compute(num, (key,oldValue) -> oldValue == null ? 1 : oldValue+1);
        }
        return map.entrySet().stream()
                .sorted((a,b) -> Integer.compare(b.getValue(),a.getValue()))
                .limit(k)
                .map(Map.Entry::getKey)
                .mapToInt(Integer::intValue)
                .toArray();
  
    }
}
