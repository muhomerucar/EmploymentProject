public class Officer extends Employee {
    private String title;

    public Officer(String name, String surname, int yearsOfExperience, String title) {
        super(name, surname, yearsOfExperience);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public double salary() {
        double baseOfficerSalary = 4250;
        double experienceFactor = (this.getYearsOfExperience()*0.3);
        return baseOfficerSalary + (experienceFactor*(baseOfficerSalary/2));
    }

    @Override
    public int insurance() {
        int minimumPolicyForOfficer = 1250;
        return minimumPolicyForOfficer;
    }

    @Override
    public double bonus() {
        return super.bonus();
    }

    @Override
    public String toString() {
        return "Officer: " +this.getName() + " " +this.getSurname();
    }
}
