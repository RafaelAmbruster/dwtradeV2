package com.smartcode.dwt.cucumber;

import com.smartcode.dwt.DwTradeApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = DwTradeApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
