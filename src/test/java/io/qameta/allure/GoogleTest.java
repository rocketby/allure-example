package io.qameta.allure;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static io.qameta.allure.Allure.parameter;

@Layer("web")
@Lead("Alex")
@Feature("Authorization")
public class GoogleTest {
    private static final String OWNER = "allure-framework";
    private static final String REPO = "allure2";

    @Test
    @AllureId("5182")
    @Owner("Tat")
    @DisplayName("Test successful authorization")
    @TM4J("AE-T8")
    @Story("Execute authorization")
    @Microservice("Authorization")
    @Tags({@Tag("GUI"), @Tag("smoke"), @Tag("authorization")})
    @ParameterizedTest(name = "Authorize in login form with correct credentials")
    @ValueSource(strings = {"login", "password"})
    @JiraIssues({@JiraIssue("HOMEWORK-242")})
    public void testAuthorizationInGUi(){
        parameter("owner", OWNER);
        parameter("repo", REPO);
    }

    @Test
    @AllureId("5193")
    @Owner("Tat")
    @DisplayName("Test not successful authorization")
    @TM4J("AE-T9")
    @Story("Execute authorization")
    @Microservice("Authorization")
    @Tags({@Tag("GUI"), @Tag("smoke"), @Tag("authorization")})
    @ParameterizedTest(name = "Authorize with wrong password")
    @ValueSource(strings = {"login", "password"})
    @JiraIssues({@JiraIssue("HOMEWORK-242")})
    public void testAuthorizationByApi(){
        parameter("owner", OWNER);
        parameter("repo", REPO);
    }


}
