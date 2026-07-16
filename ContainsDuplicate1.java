import java.util.*;
class Solutioen {
    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!mp.containsKey(nums[i])){
                mp.put(nums[i],i);
            }
            else{
                return true;
            }
        }
        return false;
    }

}

class Solutiosdn {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {

            if (set.contains(num)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }
}