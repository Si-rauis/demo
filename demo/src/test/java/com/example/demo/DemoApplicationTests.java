package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(locations = "classpath:./resources/application_test.properties")
class Demo1ApplicationTests {
    @Test
    void contextLoads() {
    }
}

