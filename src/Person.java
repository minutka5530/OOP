public class Person {
    int yearOfBirth;
    String name;
    String town;
    String jobTitle;



    Person(int yearOfBirth, String name, String town, String jobTitle) {
        if(name==null || name.isEmpty()){
            name = "НЕ указал";
        }
        this.name = name;
        if(town==null || town.isEmpty()){
            town = "НЕ указа";
        }

        this.town = town;
        if (yearOfBirth < 0){
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
        if(jobTitle==null || jobTitle.isEmpty()){
            jobTitle = "НЕ указал";
        }

        this.jobTitle = jobTitle;

    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + " Я из города " + town + " Я родился в " + yearOfBirth + " году. " +
                "Я работаю на должности " + jobTitle + " . Будем знакомы!";
    }
}
