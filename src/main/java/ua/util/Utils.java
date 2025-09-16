package ua.util;

public class Utils {
    public static boolean checkEmail(String email) {
        return ValidationHelper.isValidEmail(email);
    }
}
