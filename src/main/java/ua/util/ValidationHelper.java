package ua.util;

class ValidationHelper {
    static boolean isValidEmail(String email) {
        return email != null && email.contains("@");
    }
}
