import java.sql.SQLException;
import java.util.Scanner;

public class CreateVacanciesConsoleHandler implements ConsoleHandler {

    public void handle() {
        VacanciesRepository repository = new VacanciesRepository();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите наименование вакансии:");
        String nameOfVacancies = scanner.nextLine();

        System.out.println("Введите ключевые навыки:");
        String skills = scanner.nextLine();

        System.out.println("Введите описание:");
        String description = scanner.nextLine();

        System.out.println("Введите зарплату:");
        String salaryStr = scanner.nextLine();
        Double salary = Double.valueOf(salaryStr);

        System.out.println("Введите вид работы(офис, удаленка, смешанный):");
        String typoOfWork = scanner.nextLine();

        try {
            repository.createVacancies(new Vacancies(nameOfVacancies, description, skills, typoOfWork, salary));
        } catch (SQLException e) {
            System.out.println("error" + e.getMessage());

        }


        System.out.println(new Vacancies(nameOfVacancies, description, skills, typoOfWork, salary));
    }
}
