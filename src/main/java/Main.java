import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Создать(c) или найти(f) вакансию (c/f):");
        Scanner scanner = new Scanner(System.in);
        String handle = scanner.nextLine();
        ConsoleHandler handler = new ConsoleHandlerFactory().handle(handle);
        handler.handle();

    }
}
