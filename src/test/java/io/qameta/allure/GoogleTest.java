package io.qameta.allure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

public class GoogleTest {

    @Test
    @Microservice("Billing")
    @Tags({@Tag("api"), @Tag("smoke")})
    @ParameterizedTest(name = "Create issue via api")
    public void testAuth(){
        int a=10;
        int b=10;
        Assertions.assertTrue(a==b);
    }
}
