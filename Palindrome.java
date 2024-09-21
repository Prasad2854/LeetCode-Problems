// Given an integer x, return true if x is a palindrome
// , and false otherwise.
// Example 1:
// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
       int  rev = 0;
       int original = x;
        while(x>0){
        int rem  = x%10;
        x= x/10;
        rev = rev*10+rem;
        }
    
        if(rev == original){
        return true;
        }
        else{
           return false;
        }
      }
}
