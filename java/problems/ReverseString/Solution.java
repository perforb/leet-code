package ReverseString;

// https://leetcode.com/problems/reverse-string/
class Solution {

  public static void main(String[] args) {
    new Solution().reverseString(new char[]{'h', 'e', 'l', 'l', 'o'});      // o, l, l, e, h
    new Solution().reverseString(new char[]{'H', 'a', 'n', 'n', 'a', 'h'}); // h, a, n, n, a, H
  }

  public void reverseString(char[] s) {
    swap(s, 0, s.length - 1);
  }

  private void swap(char[] s, int left, int right) {
    if (left >= right) {
      return;
    }
    char tmp = s[left];
    s[left++] = s[right];
    s[right--] = tmp;
    swap(s, left, right);
  }
}
