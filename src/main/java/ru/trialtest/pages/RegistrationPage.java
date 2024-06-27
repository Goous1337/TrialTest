package ru.trialtest.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class RegistrationPage {

    private final SelenideElement emailInputField = $x("//input[@id='dataEmail']");
    private final SelenideElement nameInputField = $x("//input[@id='dataName']");
    private final SelenideElement genderTypeDropdownButton = $x("//select[@id='dataGender']");
    private final SelenideElement enableVariant1_1CheckBox = $x("//input[@id='dataCheck11']");
    private final SelenideElement enableVariant1_2CheckBox = $x("//input[@id='dataCheck12']");
    private final SelenideElement enableVariant2_1CheckBox = $x("//input[@id='dataSelect21']");
    private final SelenideElement enableVariant2_2CheckBox = $x("//input[@id='dataSelect22']");
    private final SelenideElement enableVariant2_3CheckBox = $x("//input[@id='dataSelect23']");
    private final SelenideElement addButton = $x("//button[@id='dataSend']");
    private final SelenideElement genderTypeFemaleButton = $x("//select[@id='dataGender']//option[2]");//TODO пофиксить кирилицу
    private final SelenideElement genderTypeMaleButton = $x("//select[@id='dataGender']//option[1]");//TODO пофиксить кирилицу
    private final SelenideElement modalContendDataАddText = $x("//div[@class='uk-margin uk-modal-content']");
    private final SelenideElement modalCloseButton = $x("//button[@class='uk-button uk-button-primary uk-modal-close']");


    public RegistrationPage sendKeysEmailInputField(String email) {
        emailInputField
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .sendKeys(email);
        return this;
    }

    public RegistrationPage sendKeysNameInputField(String name) {
        nameInputField
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .sendKeys(name);
        return this;
    }

    public RegistrationPage clickTypeGenderDropdownButton() {
        genderTypeDropdownButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    public RegistrationPage clickGenderTypeMaleButton(){
        genderTypeMaleButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    public RegistrationPage clickGenderTypeFemaleButton(){
        genderTypeFemaleButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    public RegistrationPage clickEnableVariant1_1CheckBox() {
        enableVariant1_1CheckBox
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    public RegistrationPage clickEnableVariant1_2CheckBox() {
        enableVariant1_2CheckBox
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    public RegistrationPage clickEnableVariant2_1CheckBox() {
        enableVariant2_1CheckBox
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    public RegistrationPage clickEnableVariant2_2CheckBox() {
        enableVariant2_2CheckBox
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    public RegistrationPage clickEnableVariant2_3CheckBox() {
        enableVariant2_3CheckBox
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    public RegistrationPage clickAddButton() {
        addButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }

    public RegistrationPage dataAddTextShouldExist(){
        modalContendDataАddText
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear);
        return this;
    }
    public RegistrationPage clickModalCloseButton() {
        modalCloseButton
                .shouldBe(Condition.exist)
                .shouldBe(Condition.appear)
                .click();
        return this;
    }
}