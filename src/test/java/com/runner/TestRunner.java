package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="features", glue="com.stepdef",plugin={"html:target/index.html","json:target/cucumber.json"})
public class TestRunner {

}
