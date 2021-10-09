package io.qameta.allure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

@Layer("web")
@Owner("tat")
@Feature("Authorization")
public class GoogleTest {

    @Microservice("Authorization")
    @Tags({@Tag("api"), @Tag("smoke")})
    @ParameterizedTest(name = "Authorize")
    public void testAuth(){
        int a=10;
        int b=10;
        Assertions.assertTrue(a==b);
    }
}
