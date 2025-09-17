package ua.retail.model;

final class ValidationHelper {
    private ValidationHelper() {}
    static boolean isValidEmail(String email) {
        return email != null && email.contains("@");
    }
}
