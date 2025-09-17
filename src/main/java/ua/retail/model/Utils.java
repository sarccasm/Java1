package ua.retail.model;

public final class Utils {
    private Utils() {}
    public static boolean checkEmail(String email) {
        return ValidationHelper.isValidEmail(email);
    }
}
 