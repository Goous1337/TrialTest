package ru.trialtest.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {

    private final SelenideElement emailInputField = $x("//input[@id='loginEmail']");
    private final SelenideElement passwordInputField = $x("//input[@id='loginPassword']");
    private final SelenideElement entranceButton = $x("//button[@id='authButton']");

    public LoginPage sendKeysEmailInputField(String email) {
        emailInputField
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .sendKeys(email);
        return this;
    }

    public LoginPage sendKeysPasswordInputField(String password) {
        passwordInputField
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .sendKeys(password);
        return this;
    }

    public LoginPage clickButtonEntrance() {
        entranceButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }
}