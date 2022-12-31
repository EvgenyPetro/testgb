import java.sql.SQLException;
import java.util.Scanner;

public class SearchVacanciesConsoleHandler implements ConsoleHandler {

    public void handle() {
        VacanciesRepository repo = new VacanciesRepository();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите наименование вакансии:");
        String nameOfVacancies = scanner.nextLine();
        Vacancies vacancies = null;
        try {
            vacancies = repo.getVacancies(nameOfVacancies);
            if (vacancies == null) {
                System.out.println("Вакансия не найдена");
            } else {
                System.out.println(vacancies);
            }
        } catch (SQLException e) {
            System.out.println("error" + e.getMessage());
        }

    }
}
