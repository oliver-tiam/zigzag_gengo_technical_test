package com.exam.palindrome;

import com.exam.palindrome.service.PalindromeService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class PalindromeApplicationTests {

	@Autowired
	private PalindromeService palindromeService;

	@Test
	void isNotPalindrome() {
		String string = "qwerty";
		assertThat(palindromeService.isPalindrome(string)).isEqualTo("It is not a Palindrome") ;
	}

	@Test
	void isPalindrome() {
		String string = "madam";
		assertThat(palindromeService.isPalindrome(string)).isEqualTo("It is a Palindrome");
	}

	@Test
	void isLongestPalindrome() {
		String string = "babad";
		assertThat(palindromeService.longestPalindrome(string)).isEqualTo("bab");
	}


	@Test
	void contextLoads() {
	}

}
