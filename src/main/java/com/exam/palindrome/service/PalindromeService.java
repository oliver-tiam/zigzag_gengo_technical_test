package com.exam.palindrome.service;

import org.springframework.stereotype.Service;

import java.util.stream.IntStream;

@Service
public class PalindromeService {

    int resultStart = 0;
    int resultLength = 0;

    public String isPalindrome(String input) {

        boolean isPalindrome;
        String result = "";

        isPalindrome = IntStream
                .range(0, input.length()/2)
                .noneMatch(i -> input.charAt(i) != input.charAt(input.length() -i - 1));

        if (isPalindrome) {
            result = "It is a Palindrome";
        } else {
            result = "It is not a Palindrome";
        }

        return result;
    }

    public String longestPalindrome(String s) {

        int strLength = s.length();

        // Checking if string is a single character, because a single char is a palindrome itself.
        if (strLength < 2) {
            return s;
        }

        for (int start = 0; start < strLength - 1; start++) {
            expandRange(s, start, start);   // odd, possibly a midpoint
            expandRange(s, start, start+1); // even, possibly a midpoint
        }

        return s.substring(resultStart, resultStart + resultLength);
    }

    private void expandRange(String str, int begin, int end) {

        while (begin >= 0 && end < str.length() && str.charAt(begin) == str.charAt(end)) {
            begin--;
            end++;
        }
        if (resultLength < end - begin - 1) {
            resultStart = begin + 1;
            resultLength = end - begin - 1;
        }
    }
}
