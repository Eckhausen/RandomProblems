package Easy;

public class LongestCommonPrefix {
//    Easy.LongestCommonPrefix longestCommonPrefix = new Easy.LongestCommonPrefix();
//        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"}));
//        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{"dog","racecar","car"}));
//        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{"ab", "a"}));
//        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{"reflower","flow","flight"}));
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";  // Handle empty array case
        }

        // Find the shortest string in the array
        String shortestString = strs[0];
        for(String s : strs) {
            if(s.length() < shortestString.length()) {
                shortestString = s;
            }
        }

        StringBuilder longestPrefix = new StringBuilder(shortestString);

        for (String currentWord : strs) {
            for (int j = 0; j < longestPrefix.length(); j++) {
                if (j >= currentWord.length() || currentWord.charAt(j) != longestPrefix.charAt(j)) {
                    longestPrefix.delete(j, longestPrefix.length());
                    break;
                }
            }
        }
        return longestPrefix.toString();
    }
}
