import java.util.HashMap;

public class CountElementWithMaxFrequency {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> inp = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(inp.containsKey(nums[i])){
                inp.put(nums[i], inp.get(nums[i])+1);
            }else{
                inp.put(nums[i],1);
            }
        }
        int max = -1;
        int out = 0;

        for(int a : inp.keySet()){
            if(inp.get(a) == max){
                out += inp.get(a);
            }else if(inp.get(a) > max){
                max = inp.get(a);
                out = inp.get(a);
            }
        }
        return out;
    }
}
