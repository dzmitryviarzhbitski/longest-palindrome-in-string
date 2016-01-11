package dzvz;

/**
 * Created by dzmirtyviarzhbitski on 1/10/16.
 */
public class LongestPalindrome {


    public static void main(String... s) {
        String s2 = "afafakabbak";
//        String s2 ="afaf";
        System.out.println(s2);
        System.out.println(new MaxPalindrome().find(s2));

    }

    public static String findAndPrint(String s) {
        System.out.println(s);
        String palindrome = new MaxPalindrome().find(s);
        System.out.println(palindrome);
        return palindrome;
    }

    static class MaxPalindrome {

        int start = 0;
        int end = 0;

        int left = 0;
        int right = 0;

        private MaxPalindrome() {
        }

        public String find(String s) {
            if (s == null || s.length() < 1) {
                throw new IllegalArgumentException("Pass valid value");
            }
            if (s.length() == 1) {
                return s;
            }

            for (int i = 1; i < s.length(); i++) {
                //even
                left = i - 1;
                right = i;
                findMaxPalindrome(s);
                //odd
                left = i - 1;
                right = i + 1;
                findMaxPalindrome(s);
            }
            return end > 0 ? s.substring(start, end + 1) : null;
        }

        private void findMaxPalindrome(String s) {
            while (left >= 0 && right < s.length()) {
                if (s.charAt(left) == s.charAt(right)) {
                    if (Math.max(end - start, right - left) > end - start) {
                        start = left;
                        end = right;
                    }
                    left--;
                    right++;
                } else {
                    break;
                }
            }
        }
    }


}
