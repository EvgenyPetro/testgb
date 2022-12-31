public class ConsoleHandlerFactory {

    public ConsoleHandlerFactory() {
    }

    public ConsoleHandler handle(String name) {
        ConsoleHandler handler = null;
        switch (name) {
            case "f":
                handler = new SearchVacanciesConsoleHandler();
                break;
            case "c":
                handler = new CreateVacanciesConsoleHandler();
        }
        return handler;


    }
}
