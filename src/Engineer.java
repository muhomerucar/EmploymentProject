public class Engineer extends Employee {
    private String bachelorDegree;
    private boolean hasMasterDegree;

    // name, surname and yearsOfExperience attributes are provided by Employee Class. They are inherited from super class.

    public Engineer(String name, String surname, int yearsOfExperience, String bachelorDegree, boolean hasMasterDegree) {
        super(name, surname, yearsOfExperience);
        this.bachelorDegree = bachelorDegree;
        this.hasMasterDegree = hasMasterDegree;
    }

    public String getBachelorDegree() {
        return bachelorDegree;
    }

    public boolean isHasMasterDegree() {
        return hasMasterDegree;
    }

    public void setBachelorDegree(String bachelorDegree) {
        this.bachelorDegree = bachelorDegree;
    }

    public void setHasMasterDegree(boolean hasMasterDegree) {
        this.hasMasterDegree = hasMasterDegree;
    }

    @Override
    public double salary() {
        double baseEngineerSalary = 5000;
        double masterFactor = 1.25;
        double experienceFactor = (this.getYearsOfExperience()*(0.4));
        if(this.hasMasterDegree){
            return baseEngineerSalary * masterFactor +(experienceFactor*(baseEngineerSalary/2));
        }
        else {
            return baseEngineerSalary + (experienceFactor*(baseEngineerSalary/2));
        }
    }

    @Override
    public int insurance() {
        int policyCostForEngineer = 1750;
        return policyCostForEngineer;
    }

    @Override
    public double bonus() {
        return super.bonus();
    }

    @Override
    public String toString() {
        return "Engineer: " + this.getName() + " " +this.getSurname();
    }
}
