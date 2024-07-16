import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exercise09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Nhap email
        System.out.println("Nhap email: ");
        String email = sc.nextLine();

        //Kiem tra dinh dang email
        String regexEmail = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        Pattern regexEmailPattern = Pattern.compile(regexEmail);
        Matcher regexEmailMatcher = regexEmailPattern.matcher(email);

        if (regexEmailMatcher.matches()) { // true ok, false not ok
            System.out.println("Email is valid");
        } else {
            System.out.println("Email is invalid");
        }

        //Nhap password
        System.out.println("Nhap password: ");
        String password = sc.nextLine();

        //Kiem tra dinh dang password
        if (password.length() > 6 && !password.contains(" ") ) {
            System.out.println("Password is valid");
        }else{
            System.out.println("Password is invalid");
        }
    }
}
