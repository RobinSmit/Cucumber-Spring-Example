package com.implitest.examples.cucumber;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.implitest.examples.cucumber.service")
public class CucumberConfiguration {
}
