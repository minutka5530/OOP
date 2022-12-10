public class Person {
    private int yearOfBirth;
    final private String name;
    private String town;
    final private String jobTitle;



    Person(int yearOfBirth, String name, String town, String jobTitle) {
        if(name==null || name.isEmpty()){
            name = "НЕ указал";
        }
        this.name = name;
        setTown(town);
        setYearOfBirth(yearOfBirth);

        if(jobTitle==null || jobTitle.isEmpty()){
            jobTitle = "НЕ указал";
        }

        this.jobTitle = jobTitle;

    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth < 0){
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if(this.town == null){
            this.town = "Информация не указрна";
        }
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + " Я из города " + town + " Я родился в " + yearOfBirth + " году. " +
                "Я работаю на должности " + jobTitle + " . Будем знакомы!";
    }
}
