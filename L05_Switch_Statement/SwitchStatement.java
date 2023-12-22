import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        //New way
        switch (str) {
            case "Manthan" -> {
                System.out.println("Hello Manthan");
                System.out.println("Braced");
            }
            case "Dhole" -> System.out.println("Hello Dhole");
            case "Test" -> System.out.println("Test case");
            default -> System.out.println("No name");
        }

        //Old way
        switch(str)
        {
            case "Manthan":
                System.out.println("Hello Manthan");
                break;
            case "Dhole":
                System.out.println("Hello Dhole");
                break;
            case "Test":
                System.out.println("Test");
                break;
            default:
                System.out.println("No name");
        }
    }
}
