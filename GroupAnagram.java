import java.util.*;

class grp {

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        grp obj = new grp();
        List<List<String>> result = obj.groupAnagrams(strs);
        System.out.println(result);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ansMap = new HashMap<>();
        int[] count = new int[26];

        for (String s : strs) {
            Arrays.fill(count, 0);

            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                sb.append("#").append(count[i]);
            }
            String key = sb.toString();
            ansMap.putIfAbsent(key, new ArrayList<>());
            ansMap.get(key).add(s);
        }
        return new ArrayList<>(ansMap.values());
    }
}
