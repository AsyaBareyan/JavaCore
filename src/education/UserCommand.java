package education;

public interface UserCommand {
     String EXIT = "0";
     String LOGIN = "1";
     String REGISTER = "2";

    static void printCommand() {
        System.out.println("Please input  " + EXIT + " for exit");
        System.out.println("Please input  " + LOGIN + " for login");
        System.out.println("Please input  " + REGISTER + " for registered");
    }
}
