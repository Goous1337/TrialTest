package ru.trialtest.login;


import org.junit.jupiter.api.Test;
import ru.trialtest.BaseTest;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest(){
        baseRouter.loginPage()
                .sendKeysEmailInputField("test@protei.ru")
                .sendKeysPasswordInputField("test")
                .clickButtonEntrance();

    }
}
