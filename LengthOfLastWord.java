/*
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal 
substring
 consisting of non-space characters only.

 Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
*/
class Solution {
    public int lengthOfLastWord(String s) {
        //setting the end pointer last of the string
        int end = s.length() - 1 ;
        //checkng if end is greater than 0 and string's character at end th     psoition = ' ''
        while(end >= 0 && s.charAt(end) == ' '){
            //then do end--
            end--;
        }
        // set start = end
        int start = end;
        //checking string's character is not equal to ' '
        while(start >= 0 && s.charAt(start) != ' '){
            start--;
        }
        //if space return the length end - start (10 - 5)
        return end - start;
    }
}
