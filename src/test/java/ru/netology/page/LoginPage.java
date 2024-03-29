package ru.netology.page;

import com.codeborne.selenide.SelenideElement;
import ru.netology.data.DataHelper;
/*
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private static SelenideElement login = $("[data-test-id=\"login\"] input");
    private static SelenideElement password = $("[data-test-id=\"password\"] input");
    private static SelenideElement actionLogin = $("[data-test-id=\"action-login\"]");

    public static VerificationPage validLogin(DataHelper.AuhtInfo info) {
        login.setValue(info.getLogin());
        password.setValue(info.getPassword());
        actionLogin.click();
        return new VerificationPage();

    }
}*/
import com.codeborne.selenide.SelenideElement;
import ru.netology.data.DataHelper;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private final SelenideElement loginField = $("[data-test-id=login] input");
    private final SelenideElement passwordField = $("[data-test-id=password] input");
    private final SelenideElement loginButton = $("[data-test-id=action-login]");

    public VerificationPage validLogin(DataHelper.AuthInfo info) {
        loginField.setValue(info.getLogin());
        passwordField.setValue(info.getPassword());
        loginButton.click();
        return new VerificationPage();
    }

}