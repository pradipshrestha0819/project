public class ValidationUtil {
    public static boolean validateEmail(String email) {
        return email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }
    
    public static boolean validatePhone(String phone) {
        return phone.matches("^\d{10}$");
    }
    
    public static boolean validatePassword(String password) {
        return password.length() >= 6;
    }
}