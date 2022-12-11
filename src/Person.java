public class Person {
    private int yearOfBirth;
    private String name;
    private String town;
    private String jobTitle;

    public Person(int yearOfBirth, String name, String town, String jobTitle) {
        setYearOfBirth(yearOfBirth);
        if (name == null || name.isEmpty() || name.isBlank()) {
            this.name = "Информация не указана";
        } else  {
            this.name = name;
        }
        setTown(town);
        if (jobTitle == null || jobTitle.isEmpty() || jobTitle.isBlank()) {
            this.jobTitle = "Информация не указана";
        } else {
            this.jobTitle = jobTitle;
        }

    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town == null || town.isEmpty() || town.isBlank()) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + " Я из города " + town + " Я родился в " + yearOfBirth +
                " году. Я работаю на должности - " + jobTitle + " Будем знакомы!";
    }
}
