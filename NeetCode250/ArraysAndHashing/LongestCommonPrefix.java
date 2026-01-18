package ArraysAndHashing;

public class LongestCommonPrefix {
    public static String longestPrefix(String[] strs){
        if(strs.length == 0) return "";
        String prefix = strs[0];
        for (String str : strs) {
            while (!str.startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }

            if (prefix.isEmpty()) return "";
        }

        return prefix;
    }

    public static void main(String[] args){
        String[] strs = {"bat","bag","bank","band"};
        System.out.println(longestPrefix(strs));
    }
}
