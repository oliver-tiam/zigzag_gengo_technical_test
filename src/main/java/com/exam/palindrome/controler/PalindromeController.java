package com.exam.palindrome.controler;

import com.exam.palindrome.service.PalindromeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PalindromeController {

    @Autowired
    PalindromeService palindromeService;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/answer")
    public String displayAnswers(@RequestParam("answer1") String answer1, @RequestParam("answer2") String answer2,Model model) {
        model.addAttribute("answer1", answer1);
        model.addAttribute("result1", palindromeService.isPalindrome(answer1));
        model.addAttribute("answer2", answer2);
        model.addAttribute("result2", palindromeService.longestPalindrome(answer2));
        return "answer";
    }

}
