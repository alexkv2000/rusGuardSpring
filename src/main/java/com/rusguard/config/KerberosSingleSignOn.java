package com.rusguard.config;
import waffle.windows.auth.impl.WindowsAccountImpl;


public class KerberosSingleSignOn {
    public static void main(String[] args) {
        try {
            System.out.println("Пользователь " + WindowsAccountImpl.getCurrentUsername() + " запрашивает данные из RusGuard.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
