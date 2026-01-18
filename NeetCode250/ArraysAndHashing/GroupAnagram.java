package ArraysAndHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    public static List<List<String>> groupAnagrams(String[] strs){
        HashMap<String, List<String>> map = new HashMap<>();
        int[] count = new int[26];

        for(String s : strs){
            Arrays.fill(count, 0);

            for(char ch : s.toCharArray()){
                count[ch - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for(int num : count){
                sb.append('#');
                sb.append(num);
            }

            String key = sb.toString();
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args){
        String[] strs = {"act","pots","tops","cat","stop","hat"};
        System.out.println(groupAnagrams(strs));
    }
}
