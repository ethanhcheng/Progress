class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int val = x;
        int rev = reverse(x);

        if (val == rev) {
            return true;
        } else {
            return false;
        }
    }
    int reverse(int x){
            int res = 0;
            while (x>0) {
                int temp = x%10;
                res = (res*10) + temp;
                x = x/10;
            }
            return res;
        }
}
