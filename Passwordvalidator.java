import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        int sa = 0;
        if (password.length() >= 8) {
            sa++;
        }

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                hasUpper = true;
            } 
            else if (ch >= 'a' && ch <= 'z') {
                hasLower = true;
            } 
            else if (ch >= '0' && ch <= '9') {
                hasDigit = true;
            }
        }

        if (hasUpper) {
            sa++;
        }

        if (hasLower) {
            sa++;
        }

        if (hasDigit) {
            sa++;
        }

        System.out.println("\n-- Verdict --");

        if (sa == 4) {
            System.out.println("Password Strength: STRONG");
        } 
        else if (sa == 3) {
            System.out.println("Password Strength: MEDIUM");
        } 
        else  {
            System.out.println("Password Strength: WEAK");
        } 
        

        scanner.close();
    }
}                                                        