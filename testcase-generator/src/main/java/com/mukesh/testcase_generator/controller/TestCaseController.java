package com.mukesh.testcase_generator.controller;

import com.mukesh.testcase_generator.model.TestCase;
import com.mukesh.testcase_generator.service.TestCaseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TestCaseController {

    private final TestCaseService service;

    public TestCaseController(TestCaseService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/generate")
    public String generate(@RequestParam("input") String input, Model model) {
        List<TestCase> testCases = service.generateTestCases(input);
        model.addAttribute("testCases", testCases);
        return "index";
    }
}