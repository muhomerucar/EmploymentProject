

public class Employee implements IContract {
    private String name;
    private String surname;
    private int yearsOfExperience;

    public Employee(String name, String surname, int yearsOfExperience) {
        this.name = name;
        this.surname = surname;
        this.yearsOfExperience = yearsOfExperience;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public double salary() {
        double minimumWage = 2500;
        return minimumWage;
    }

    @Override
    public int insurance() {
        int minimumPolicyCost = 500;
        return minimumPolicyCost;
    }

    @Override
    public double bonus() {
        return (this.salary()*(7.25/100));
    }

    @Override
    public String toString() {
        return "Employee: {" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                '}';
    }


}
