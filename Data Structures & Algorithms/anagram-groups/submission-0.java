class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] arr1 = strs[i].toCharArray();
            Arrays.sort(arr1);
            String str = String.valueOf(arr1);
            if(!hm.containsKey(str)){
                hm.put(str, new ArrayList());
            }
            hm.get(str).add(strs[i]);
        }
        return new ArrayList<>(hm.values());
    }
}
