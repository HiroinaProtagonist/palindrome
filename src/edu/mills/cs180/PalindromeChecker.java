package edu.mills.cs180;

/**
 * A static utility class for testing whether strings are palindromes.
 *
 * @author Zoe Abrams
 */
public class PalindromeChecker {
  private PalindromeChecker() {}

  /**
   * Checks whether the given string is a palindrome. A string is considered a palindrome if it
   * reads the same forwards and backwards, ignoring case, once all non-alphanumeric characters are
   * removed.
   *
   * @param s the string to check
   * @return true if the string is a palindrome, false otherwise
   */
  public static boolean isPalindrome(String s) {
    s = s.replaceAll("[^A-Za-z0-9]", "");
    StringBuilder sb = new StringBuilder(s);
    sb.reverse();
    return s.equalsIgnoreCase(sb.toString());
  }
}
