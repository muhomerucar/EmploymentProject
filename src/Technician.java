public class Technician extends Employee {
    private boolean hasJuniorCollege;

    public Technician(String name, String surname, int yearsOfExperience, boolean hasJuniorCollege) {
        super(name, surname, yearsOfExperience);
        this.hasJuniorCollege = hasJuniorCollege;
    }

    public boolean isHasJuniorCollege() {
        return hasJuniorCollege;
    }

    public void setHasJuniorCollege(boolean hasJuniorCollege) {
        this.hasJuniorCollege = hasJuniorCollege;
    }

    @Override
    public double salary() {
        double baseTechnicianSalary = 3000;
        double juniorDegreeFactor = 1.25;
        double experienceFactor = (this.getYearsOfExperience()*0.2);
        if(hasJuniorCollege){
            return baseTechnicianSalary * juniorDegreeFactor +(experienceFactor*(baseTechnicianSalary/2));
        }else{
            return baseTechnicianSalary * (experienceFactor*(baseTechnicianSalary/2));
        }
    }

    @Override
    public int insurance() {
        int minimumPolicyCostForTechnician = 750;
        return minimumPolicyCostForTechnician;
    }


    @Override
    public double bonus() {
        return super.bonus();
    }

    @Override
    public String toString() {
        return "Technician: " + this.getName() + " " +this.getSurname();
    }
}
