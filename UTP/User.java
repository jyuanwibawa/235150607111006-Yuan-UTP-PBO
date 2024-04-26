import java.util.Scanner;

public class User {

    private String email;
    private String password;
    private static Scanner in = new Scanner(System.in);

    public User() {
        this.email = "";
        this.password = "";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static String userLogin() {
        System.out.print("Email :");
        String email = in.nextLine();
        return email;
    }

    public static String pwLogin() {
        System.out.print("Password :");
        String password = in.nextLine();
        return password;
    }

    public static void main(String[] args) {
        User user = new User();
        String nama, initial;
        boolean regist = true;

        while (regist) {
            System.out.print("Full Name :");
            nama = in.nextLine();

            System.out.print("Email  :");
            user.setEmail(in.nextLine());

            System.out.print("Password :");
            user.setPassword(in.nextLine());

            regist = false;
            System.out.println("Successfully registered User");

            for (int i = 3; i >= 1; i--) {

                if (userLogin().equals(user.getEmail()) && pwLogin().equals(user.getPassword())) {
                    System.out.println("Login Success");
                    break;
                } else {
                    System.out.println("Gagal");
                }
            }
        }
    }
}