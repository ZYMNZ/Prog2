import java.util.*;

class Profile {
    //    oh shit i spilled my paint sir, sorry
    //SOME COLORS TO DESIGN THE CODE
    public static final String ANSI_BLUE = "\u001b[34m";
    public static final String ANSI_MAGENTA = "\u001b[34m";
    public static final String ANSI_CYAN = "\u001b[36m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
//////////////////////////////////////////////////////////////

    String username;
    String password;
    String hint1;
    String ans_hint1;
    String hint2;
    String ans_hint2;


    public Profile() {

    }

    public Profile(String username) {
        this.username = username;
    }

    public Profile(String password, String a) {
        this.password = password;
    }

    public Profile(String hint1, String ans_hint1, String hint2, String ans_hint2) {
        this.hint1 = hint1;
        this.ans_hint1 = ans_hint1;
        this.hint2 = hint2;
        this.ans_hint2 = ans_hint2;

    }


    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHint1() {
        return this.hint1;
    }

    public void setHint1(String hint1) {
        this.hint1 = hint1;
    }

    public String getAns_hint1() {
        return this.ans_hint1;
    }

    public void setAns_hint1(String ans_hint1) {
        this.ans_hint1 = ans_hint1;
    }

    public String getHint2() {
        return this.hint2;
    }

    public void setHint2(String hint2) {
        this.hint2 = hint2;
    }

    public String getAns_hint2() {
        return this.ans_hint2;
    }

    public void setAns_hint2(String ans_hint2) {
        this.ans_hint2 = ans_hint2;
    }
}

class UserInvalidException extends Throwable {
    public UserInvalidException() {
        System.out.println("Username is not Valid. Please Retry.");
    }
}

class UserCheck extends UserInvalidException {
    Profile pr = new Profile();
    ArrayList<String> usernamelist = new ArrayList<String>();

    public void validation() {
        Scanner sc = new Scanner(System.in);
        boolean f = true;
        boolean temp = true;
        char ch;
        String username = "";
        while (f) {
            System.out.println("Enter Username: ");
            username = sc.next();
            try {
                for (int i = 0; i < username.length(); i++) {
                    ch = username.charAt(i);
                    if (ch < 'A' || ch > 'Z' && (ch > 'z' || ch < 'a')) {
                        temp = false;
                        throw new UserInvalidException();
                    }
                }
                temp = true;

                if (temp == true) {

                    f = false;
                    //continue;
                }
            } catch (UserInvalidException e) {

            }
            Profile pr = new Profile(username);
            usernamelist.add(username);
        }


    }

}

class PassCheck extends Exception {
    Profile pr = new Profile();
    ArrayList<String> passwordlist = new ArrayList<String>();
    public void validation() {
        Scanner sc = new Scanner(System.in);
        boolean f = true;
        boolean temp = true;
        char ch;
        String password = "";
        while (f) {
            System.out.println("Enter Password: ");
            password = sc.next();

            try {
                for (int j = 0; j < password.length(); j++) {
                    ch = password.charAt(j);
                    if (password.length() < 8 && !password.contains(pr.getUsername()) && (ch < 'A' || ch > 'Z' && ch < 00 && ch < 'a' || ch > 'z' && ch != '!' || ch != '@' ||
                            ch != '#' || ch != '$' || ch != '%' || ch != '&' || ch != '*' || ch != '_' || ch != '-' || ch != '~')) {
                        temp = false;
                        throw new Exception();
                    }
                }

                temp = true;
                if (temp == true) {

                    f = false;

                }
            } catch (Exception e) {
                System.out.println(e);
            }
            Profile pr = new Profile(password, "");
            passwordlist.add(password);
        }

    }

}


public class ass4 {
    public static void main(String[] args) {
        //COLORS TO DESIGN THE MENU
        String ANSI_BLUe = "\u001b[34m";
        String ANSI_MAGENTa = "\u001b[34m";
        String ANSI_CYAn = "\u001b[36m";
        String ANSI_GREEn = "\u001B[32m";

        ArrayList<Profile> usernamelist = new ArrayList<Profile>();

        Scanner sc = new Scanner(System.in);
        Profile p = new Profile();
        UserCheck uc = new UserCheck();
        PassCheck pcc = new PassCheck();

        boolean exit = true;

        char ch;
        while (exit) {
            System.out.println("Menu \n" + ANSI_CYAn + "1. Create Account " + ANSI_GREEn + " 2. Login " + ANSI_BLUe + " 3. Exit ");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Creating Profile(option ~1~) ");
                    uc.validation();

                    pcc.validation();

                    System.out.println("Enter your 1st hint: ");
                    String h1 = sc.next();
                    System.out.println("Enter your 1st hint answer: ");
                    String h1_ans = sc.next();
                    System.out.println("Enter your 2nd hint: ");
                    String h2 = sc.next();
                    System.out.println("Enter your 2nd hint answer: ");
                    String h2_ans = sc.next();

                    Profile pf = new Profile(h1, h1_ans, h2, h2_ans);
                    usernamelist.add(pf);
                    break;
                case 2:
                    System.out.println("You chose option '2' ~to login~");
                    boolean f = true;
                    while (f) {
//                        try {
//                            if (p.username.isEmpty()) {
//                                throw new Exception();
//                            }
//                        } catch (Exception e) {
//                            System.out.println("No Profile Created. Please Create Profile First.");
//                            break;
//                        }

                        System.out.println("Enter user name");
                        String username = sc.next();
                        System.out.println("Enter password");
                        String password = sc.next();
                        System.out.println("Enter your 1st hint: ");
                        String h_1 = sc.next();
                        System.out.println("Enter your 1st hint answer: ");
                        String h_1_ans = sc.next();
                        System.out.println("Enter your 2nd hint: ");
                        String h_2 = sc.next();
                        System.out.println("Enter your 2nd hint answer: ");
                        String h_2_ans = sc.next();

                        try {
                            if (username.equals(p.getUsername()) && password.equals(p.getPassword()) && h_1.equals(p.getHint1()) && h_1_ans.equals(p.getAns_hint1()) && h_2.equals(p.getHint2()) && h_2_ans.equals(p.getAns_hint2())) {

                                System.out.println("Login Successful!!!");
                                f = false;
                            } else {
                                throw new Exception();
                            }
                        } catch (Exception e) {
                            System.out.println("Login Failed");
                        }

                    }
                    break;
                case 3:
                    exit = false;
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
