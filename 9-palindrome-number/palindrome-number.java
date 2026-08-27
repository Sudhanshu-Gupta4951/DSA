class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
        return false;
        long reversed = Long.parseLong(new StringBuilder(String.valueOf(x)).reverse().toString());
        if (reversed == x)
        return true;
        else 
        return false;
    }
}