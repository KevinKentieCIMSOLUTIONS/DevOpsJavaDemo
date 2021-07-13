package com.cimsolutions.devopsdemo;

import static org.assertj.core.api.Assertions.assertThat;

import com.cimsolutions.devopsdemo.controller.WelcomeController;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SmokeTest {

    @Autowired
    private WelcomeController controller;

    @Test
    public void contextLoads() throws Exception {
        assertThat(controller).isNotNull();
    }
}
