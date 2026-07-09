import java.util.*;
class lution {
    public int minimumCost(int[] cost) {
        int min_cost=0,count=0;
        Arrays.sort(cost);
        for(int i = cost.length - 1; i >= 0; i--){
            if(count<2){
                min_cost=cost[i]+min_cost;
                count++;
            }
            else{
                count=0;
            }
        }
        return min_cost;
    }
}
