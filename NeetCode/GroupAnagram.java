import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    private List<List<String>> groupAnagram(String[] strs){
        if(strs.length == 0) return new ArrayList<>();
        HashMap<String, List> map = new HashMap<>();
        int[] count = new int[26];

        for(String s : strs){
            Arrays.fill(count, 0);
            for(char c : s.toCharArray()){
                count[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int num : count){
                sb.append('#');
                sb.append(num);
            }

            String key = sb.toString();
            if(!map.containsKey(key)){
                map.put(key, new ArrayList());
            }
            map.get(key).add(s);
        }

        return new ArrayList(map.values());
    }

    public static void main(String[] args){
        GroupAnagram obj1 = new GroupAnagram();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(obj1.groupAnagram(strs));
    }
}
