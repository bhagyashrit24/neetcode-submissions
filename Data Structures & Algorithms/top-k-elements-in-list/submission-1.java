class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        List<Integer>[] arr = new List[nums.length + 1];
        for(int key:hm.keySet()){
            int k1 = key;
            int v = hm.get(k1);
            if(arr[v] == null){
                arr[v] = new ArrayList();
            }
            arr[v].add(k1);
        }
        int[] ans = new int[k];
        int idx = 0;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i] != null && idx<k){
                for(int j:arr[i]){
                    ans[idx] = j;
                    idx++;
                    if(idx == k){return ans;}
                }
                
            }
        }
        return ans;
    }
}
