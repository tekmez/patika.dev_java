import java.util.Scanner;

public class Auth {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Username: ");
        String userName = inp.nextLine();
        System.out.print("Password: ");
        String password = inp.nextLine();
        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Success");
        }else {
            System.out.println("wrong password, Would you like create new password ?");
            String answer = inp.nextLine();
            if(answer.equals("yes")){
                System.out.print("Enter a new password: ");
                String newPassword = inp.nextLine();
                if (newPassword.equals("java123")) {
                    System.out.println("Cannot be equals to old password, enter a new password");
                    String newPassword2 = inp.nextLine();
                    System.out.println("created new password");
                }
                else{
                    System.out.println("created new password");
                }
            }
            else {
                System.out.println("created new password");
            }
        }
    }
}
