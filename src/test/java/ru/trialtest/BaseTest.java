package ru.trialtest;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import ru.trialtest.helper.RandomHelper;
import ru.trialtest.pages.BaseRouter;

public class BaseTest {

    private final String authorizationPageUrl = System.getProperty("user.dir") + "/qa-test.html";
    protected RandomHelper randomHelper = new RandomHelper();
    public BaseRouter baseRouter = new BaseRouter();

    @BeforeEach
    public void setupSelenideConfiguration(){
        Configuration.timeout = 10000;
        Configuration.browserSize = "1920x1080";
        Selenide.open(authorizationPageUrl);
    }

    @AfterEach
    public void closeBrowser(){
        Selenide.closeWebDriver();
    }
}
