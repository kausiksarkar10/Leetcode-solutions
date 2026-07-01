// brute force
class Sol {
    public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            boolean unique = true;

            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    unique = false;
                    break;
                }
            }

            if (unique) {
                return i;
            }
        }

        return -1;
    }
}

//Optimal Solution
class opt {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];

        // Count frequency
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        // Find first unique character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (freq[ch - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}