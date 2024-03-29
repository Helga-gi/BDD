package ru.netology.data;

import lombok.Value;
import java.util.Random;

public class DataHelper {
    private DataHelper() {
    }

    public static AuthInfo getAuthInfo() {
        return new AuthInfo("vasya", "qwerty123");
    }


    public static CardInfo getFirstCard() {
        return new CardInfo("5559 0000 0000 0001", "92df3f1c-a033-48e6-8390-206f6b1f56c0");
    }

    public static CardInfo getSecondCard() {
        return new CardInfo("5559 0000 0000 0002", "0f3f5c2a-249e-4c3d-8287-09f7a039391d");
    }

    public static CardInfo getInvalidCard() {
        long first15 = (long) (Math.random() * 1000000000000000L);
        String strFirst15 = Long.toString(first15);
        String errorCard = "0" + strFirst15;
        return new CardInfo(errorCard, "00000000-0000-0000-0000-000000000000");
    }


    public static VerificationCode getVerificationCode() {
        return new VerificationCode("12345");
    }

    public static int generalValidAmount(int balance) {
        return new Random().nextInt(Math.abs(balance)) + 1;
    }

    public static int generalInvalidAmount(int balance) {
        return Math.abs(balance) + new Random().nextInt(10000);
    }


    @Value
    public static class AuthInfo {
        String login;
        String password;
    }

    @Value
    public static class CardInfo {
        String cardNumber;
        String testId;
    }

    @Value
    public static class VerificationCode {
        String code;
    }
}