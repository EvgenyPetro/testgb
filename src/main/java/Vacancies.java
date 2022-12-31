public class Vacancies {

    private String id;
    private String nameOfVacancies;
    private String description;
    private String skills;
    private String typeOfWork;
    private Double salary;

    public Vacancies() {
    }

    public Vacancies(String nameOfVacancies, String description, String scills, String typeOfWork, Double salary) {
        this.nameOfVacancies = nameOfVacancies;
        this.description = description;
        this.skills = scills;
        this.typeOfWork = typeOfWork;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameOfVacancies() {
        return nameOfVacancies;
    }

    public void setNameOfVacancies(String nameOfVacancies) {
        this.nameOfVacancies = nameOfVacancies;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getTypeOfWork() {
        return typeOfWork;
    }

    public void setTypeOfWork(String typeOfWork) {
        this.typeOfWork = typeOfWork;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Vacancies{" +
                "Наименование вакансии: '" + nameOfVacancies + '\'' +
                ", описание: '" + description + '\'' +
                ", навыки: '" + skills + '\'' +
                ", вид работы: '" + typeOfWork + '\'' +
                ", зарплата: " + salary +
                '}';
    }
}
