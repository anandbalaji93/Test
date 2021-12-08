import java.util.Arrays;
import java.util.regex.Pattern;

public class ValidPhoneNumber {
    public static void main(String[] args) {
        String phone = "(000)-000-000-000";
        String arr = Arrays.toString(phone.split("-"));
        System.out.println(phone.matches("\\(\\d{3}\\)-\\d{3}-\\d{3}-\\d{4}"));
    }
}
