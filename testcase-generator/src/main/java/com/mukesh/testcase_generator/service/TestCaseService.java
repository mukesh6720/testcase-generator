package com.mukesh.testcase_generator.service;

import com.mukesh.testcase_generator.model.TestCase;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestCaseService {

    public List<TestCase> generateTestCases(String input) {
        // Hardcoded prompt logic: generate dummy test cases
        List<TestCase> cases = new ArrayList<>();

        cases.add(new TestCase(
                "TC-001",
                "Verify submit button using valid credentials",
                "Enter valid username and password, click submit",
                "User should be logged in successfully"
        ));

        cases.add(new TestCase(
                "TC-002",
                "Verify submit button using invalid credentials",
                "Enter invalid username and password, click submit",
                "Error message should be displayed"
        ));

        return cases;
    }
}
