class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<strs.size();i++){
            sb.append(strs.get(i).length()).append("#").append(strs.get(i));
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String> li = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int hashIndex = str.indexOf("#", i);
            int len = Integer.parseInt(str.substring(i, hashIndex));
            String s = str.substring(hashIndex+1, hashIndex+1+len);
            li.add(s);
            i = hashIndex + 1 + len;

        }
        return li;
    }
}
