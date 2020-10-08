# zigzag_gengo_technical_test
technical test repo for Zigzag/Gengo Senior Software Engineer

This will serve as a readme guide to the simple program that had been created.

This is a simple Spring Boot application that contains two Palindrome functions

Explanation for the following functions

1. public String isPalindrome(String input) -
    
   This function takes in a string as an input and outputs whether "It is a Palindrome" or "It is not a Palindrome".
   It utilizes the advantage of Java 8 style of coding. It uses IntStream and range by dividing the length into two
   and start traversing from the start and end and start comparing character by character, using noneMatch to return a boolean.
   Then this boolean will be used to determine whether to display "It is a Palindrome" or "It is not a Palindrome".
   
   
2. public String longestPalindrome(String s)

   This function takes in a string as an input and outputs the longest palindrome substring in a given string. This time, instead of 
   having the start and end at the beginning and end of string and comparing it, this function tries to determine the possible midpoint
   and thereby traverses outwardly, not inwardly towards the center of the string. It somehow eliminate the need to have a possible two 
   looping, one for the start and one for the end that is use for comparing equality.
   
   
   
   
