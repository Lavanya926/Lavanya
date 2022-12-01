package com.lavvu.hrms;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\feature\\Hrms.feature",glue="com.lavvu.hrms",plugin= {"pretty","html:test_output"})

public class Testrun {

}
