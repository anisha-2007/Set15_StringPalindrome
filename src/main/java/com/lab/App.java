package com.lab;

public class App {

    public static boolean isPalindrome(String text) {
        if (text == null) {
            throw new IllegalArgumentException("String must not be null");
        }

        String cleaned = text.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String text = "madam";

        if (isPalindrome(text)) {
            System.out.println(text + " is a Palindrome");
        } else {
            System.out.println(text + " is not a Palindrome");
        }
    }
}