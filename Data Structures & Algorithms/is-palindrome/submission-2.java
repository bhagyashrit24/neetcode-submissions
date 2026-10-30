class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch: s.toCharArray()){
            if(Character.isLetter(ch)){
                sb.append(Character.toLowerCase(ch));
            }
            else if(Character.isDigit(ch)){
                sb.append(ch);
            }
        }
        String str = sb.toString();
        System.out.println(str);
        int l = 0;
        int r = str.length() - 1;
        while (l < r) {
            if(str.charAt(l) != str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
