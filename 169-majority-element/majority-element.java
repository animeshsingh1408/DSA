class Solution {
    public int majorityElement(int[] nums) {
        int p,q=0,n=nums.length,a=n/2;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
               int value=map.get(nums[i]);
                map.put(nums[i],value+1);
            }
            else{
            map.put(nums[i], 1);
            }
        }
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            p=e.getValue();
            if(p>a)
            return e.getKey();

        }
        return q;


        
    }
}