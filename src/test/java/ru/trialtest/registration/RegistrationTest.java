package ru.trialtest.registration;

import org.junit.jupiter.api.Test;
import ru.trialtest.BaseTest;


public class RegistrationTest extends BaseTest {

    @Test
    public void registrationTestOne(){
        baseRouter.loginPage()
                .sendKeysEmailInputField("test@protei.ru")
                .sendKeysPasswordInputField("test")
                .clickButtonEntrance();

        baseRouter.registrationPage()
                .sendKeysEmailInputField(randomHelper.getRandomEmail(6))
                .sendKeysNameInputField(randomHelper.getRandomString(7))

                .clickTypeGenderDropdownButton()
                .clickGenderTypeMaleButton()
                .clickEnableVariant1_1CheckBox()
                .clickEnableVariant1_2CheckBox()
                .clickEnableVariant2_1CheckBox()
                .clickAddButton()
                .dataAddTextShouldExist()
                .clickModalCloseButton();
    }

    @Test
    public void registrationTestTwo(){
        baseRouter.loginPage()
                .sendKeysEmailInputField("test@protei.ru")
                .sendKeysPasswordInputField("test")
                .clickButtonEntrance();

        baseRouter.registrationPage()
                .sendKeysEmailInputField(randomHelper.getRandomEmail(6))
                .sendKeysNameInputField(randomHelper.getRandomString(7))
                .clickTypeGenderDropdownButton()
                .clickEnableVariant1_1CheckBox()
                .clickEnableVariant1_2CheckBox()
                .clickEnableVariant2_2CheckBox()
                .clickAddButton()
                .dataAddTextShouldExist()
                .clickModalCloseButton();
    }

    @Test
    public void registrationTestThree(){
        baseRouter.loginPage()
                .sendKeysEmailInputField("test@protei.ru")
                .sendKeysPasswordInputField("test")
                .clickButtonEntrance();

        baseRouter.registrationPage()
                .sendKeysEmailInputField(randomHelper.getRandomEmail(6))
                .sendKeysNameInputField(randomHelper.getRandomString(7))

                .clickTypeGenderDropdownButton()
                .clickGenderTypeFemaleButton()
                .clickEnableVariant1_1CheckBox()
                .clickEnableVariant1_2CheckBox()
                .clickEnableVariant2_3CheckBox()
                .clickAddButton()
                .dataAddTextShouldExist()
                .clickModalCloseButton();
    }
}
