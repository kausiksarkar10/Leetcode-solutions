import java.util.*;
class Solution45 {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()){
            return "";
        }
        HashMap<Character,Integer> target=new HashMap<>();
        HashMap<Character,Integer> window=new HashMap<>();

        for(char ch:t.toCharArray()){
            target.put(ch,target.getOrDefault(ch,0)+1);
        }
        int left=0;
        int minimum=Integer.MAX_VALUE;
        int start=0;
        int formed=0;
        int tag=target.size();
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            window.put(ch,window.getOrDefault(ch,0)+1);
            if(target.containsKey(ch) && target.get(ch)==window.get(ch)){
                formed++;
            }
            while(left<=right && formed==tag){
                if(right-left+1<minimum){
                    minimum=right-left+1;
                    start=left;
                }
                char remove = s.charAt(left);
                window.put(remove,window.get(remove)-1);
                if(target.containsKey(remove) && window.get(remove) < target.get(remove)){
                    formed--;
                }
                left++;
            }

        }
        return minimum == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minimum);

    }
}
//CASU
//C → Count the target frequencies.
//A → Add characters by moving right.
//S → Satisfy a requirement (formed++).
//U → Update the answer while shrinking from the left.