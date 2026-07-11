
import java.util.HashSet;
class JAS {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> mp=new HashSet<>();
        int count=0;
        for(int i=0;i<jewels.length();i++){
            char ch=jewels.charAt(i);
            mp.add(ch);
        }
        for(int i=0;i<stones.length();i++){
            char ch=stones.charAt(i);
            if(mp.contains(ch)){
                count++;
            }
        }
        return count;
    }
}
class jewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;

        for(int i=0;i<jewels.length();i++){
            char ch=jewels.charAt(i);
            int j=0;
            while(j<stones.length()){
                if(ch==stones.charAt(j)){
                    count++;
                }
                j++;
            }
        }
        return count;
    }
}