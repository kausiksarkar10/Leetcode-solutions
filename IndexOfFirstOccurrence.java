class IndexOfFirstOccurrence {
    static void main() {
        String haystack="wegsgll";
        String needle="ll";
        int result = strStr(haystack, needle);
        System.out.println(result);

    }
    static int strStr(String haystack, String needle) {

        for (int i = 0; i <= haystack.length() -needle.length() ; i++) {//because after that there aren’t enough characters left to match the entire needle.
            int j = 0;

            while (j < needle.length() &&
                    haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            if (j == needle.length()) {
                return i;
            }
        }
        return -1;
    }

}
