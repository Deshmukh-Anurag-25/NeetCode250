package ArraysAndHashing;

public class ValidAnagram {
    public static boolean validAnagram(String s, String t){
        if(s.length() != t.length()) return false;
        int[] alphabets = new int[26];
        for(int i = 0; i < s.length(); i++){
            alphabets[s.charAt(i) - 'a']++;
            alphabets[t.charAt(i) - 'a']--;
        }

        for(int num : alphabets){
            if(num != 0) return false;
        }
        return true;
    }

    public static void main(String[] args){
        String s = "anagram";
        String t = "nagaram";
        String u = "anugram";
        System.out.println(validAnagram(s, t));
        System.out.println(validAnagram(s, u));
    }
}
