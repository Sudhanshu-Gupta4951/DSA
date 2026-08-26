class Solution {
    public String longestCommonPrefix(String[] strs) {

       String prefix = "";
       for (int i=0; i<=strs[0].length(); i++){    //for character
        for (int j=0; j<=strs.length-1; j++){      //for string
            if( i >= strs[j].length() || strs[0].charAt(i) != strs[j].charAt(i)) {
                return prefix;
            } 
        }
         prefix += strs[0].charAt(i);
       }
       return prefix;
    }
}