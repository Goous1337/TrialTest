package ru.trialtest.pages;

import static com.codeborne.selenide.Selenide.page;

public class BaseRouter {

    public LoginPage loginPage() {return page(LoginPage.class);}
    public RegistrationPage registrationPage() {return page(RegistrationPage.class);}
}
