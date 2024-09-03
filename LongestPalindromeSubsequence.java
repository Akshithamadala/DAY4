public class LongestPalindromeSubsequence {

    public static int longestPalindromeSubseq(String s) {
        int n = s.length();
        // Create a 2D array to store the length of the longest palindromic subsequence
        int[][] dp = new int[n][n];

        // Each character is a palindrome of length 1
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }

        // Fill the dp array
        for (int length = 2; length <= n; length++) {
            for (int i = 0; i <= n - length; i++) {
                int j = i + length - 1;
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2; // If characters match, include them
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]); // Otherwise, take the max length excluding one character
                }
            }
        }

        // The result is in the top right corner of the dp array
        return dp[0][n - 1];
    }

    public static void main(String[] args) {
        String s = "abdbca";
        System.out.println("Length of the longest palindromic subsequence: " + longestPalindromeSubseq(s));
    }
}
