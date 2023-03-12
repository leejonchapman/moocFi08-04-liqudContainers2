import java.util.Scanner;

public class UserInterface {
    Scanner scanner;
    Container first;
    Container second;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        first = new Container();
        second = new Container();
    }

    public void start() {
        boolean runMenu = true;
        while (runMenu) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String uI = scanner.nextLine();

            if (uI.equals("add")) {
                int uIAmount = scanner.nextInt();
                first.add(uIAmount);
            }
            if (uI.equals("remove")) {
                int uIAmount = scanner.nextInt();
                second.remove(uIAmount);
            }
            if (uI.equals("move")) {
                int uIAmount = scanner.nextInt();
                first.remove(uIAmount);
                second.add(uIAmount);
            }
            if (uI.equals("quit")) {
                runMenu = false;
            }
        }
    }
}
