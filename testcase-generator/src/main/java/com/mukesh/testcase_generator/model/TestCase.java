package com.mukesh.testcase_generator.model;

public class TestCase {
    private String tcId;
    private String testScenario;
    private String stepsToReproduce;
    private String expectedResult;

    public TestCase() {}

    public TestCase(String tcId, String testScenario, String stepsToReproduce, String expectedResult) {
        this.tcId = tcId;
        this.testScenario = testScenario;
        this.stepsToReproduce = stepsToReproduce;
        this.expectedResult = expectedResult;
    }

    public String getTcId() { return tcId; }
    public void setTcId(String tcId) { this.tcId = tcId; }

    public String getTestScenario() { return testScenario; }
    public void setTestScenario(String testScenario) { this.testScenario = testScenario; }

    public String getStepsToReproduce() { return stepsToReproduce; }
    public void setStepsToReproduce(String stepsToReproduce) { this.stepsToReproduce = stepsToReproduce; }

    public String getExpectedResult() { return expectedResult; }
    public void setExpectedResult(String expectedResult) { this.expectedResult = expectedResult; }
}