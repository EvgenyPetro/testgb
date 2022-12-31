import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VacanciesRepository {


    private final Connection connection;
    private static final String INSERT_VACANCIE = "INSERT INTO Vacancies" +
            "  (name, description, skills, type_of_work, salary) VALUES " +
            " (?, ?, ?, ?, ?);";
    private static final String FIND_VACANCIES = "select * from Vacancies where name like ?";

    public VacanciesRepository() {
        connection = new PostgresConnector().connect();
    }

    public Vacancies getVacancies(String name) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(FIND_VACANCIES);
        preparedStatement.setString(1, name + "%");
        ResultSet resultSet = preparedStatement.executeQuery();
        Vacancies vacancies = null;
        while (resultSet.next()) {

            String nameVacancies = resultSet.getString("name");
            String description = resultSet.getString("description");
            String skills = resultSet.getString("skills");
            String typeOfWork = resultSet.getString("type_of_work");
            double salary = resultSet.getDouble("salary");
            vacancies = new Vacancies(nameVacancies, description, skills, typeOfWork, salary);
        }
        return vacancies;

    }

    public String createVacancies(Vacancies vacancie) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_VACANCIE);
        preparedStatement.setString(1, vacancie.getNameOfVacancies());
        preparedStatement.setString(2, vacancie.getDescription());
        preparedStatement.setString(3, vacancie.getSkills());
        preparedStatement.setString(4, vacancie.getTypeOfWork());
        preparedStatement.setDouble(5, vacancie.getSalary());
        preparedStatement.execute();
        return "Created";
    }


}
