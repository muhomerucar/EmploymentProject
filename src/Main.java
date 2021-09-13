import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    //Basic example of polymorphism. We can add Engineer, Technician and Officer Classes to same list.
    public static List<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) {

        boolean flag = true;
        while (flag){
            System.out.println("Instructions\n" +
                    "1 - To add a new employee...\n" +
                    "2 - To remove an employee...\n" +
                    "3 - To list all employees...\n" +
                    "4 - To calculate current cost of an employee...\n" +
                    "0 - To exit...\n");


            Scanner scanner = new Scanner(System.in);
            int instruction = scanner.nextInt();
            switch (instruction){
                case 1:
                    hireNewEmployee();
                    break;
                case 2:
                    listAllEmployee();
                    System.out.println("Please enter index of employee to delete...");
                    int indexOfToBeDeletedEmployee = scanner.nextInt();
                    removeAnEmployee(indexOfToBeDeletedEmployee);
                    break;
                case 3:
                    listAllEmployee();
                    break;
                case 4:
                    if(employeeList.size() < 1){
                        System.out.println("There is no hired employee...");
                    }
                    else{
                        listAllEmployee();
                        System.out.println("Please enter index of employee to calculate his/her current salary...");
                        int indexOf = scanner.nextInt();
                        System.out.println("Total cost of the employee is: " +calculateTotalCostOfEmployee(indexOf));
                    }
                    break;

                case 0:
                    System.out.println("Exiting...");
                    flag = false;
                    break;
                default:
                    System.out.println("Waiting for valid instruction...");
                    break;
            }
        }


    }


    public static boolean hasMasterDegreeOrJuniorDegree(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Does Employee has a Master or Junior College");
        char masterDegree = scanner.nextLine().charAt(0);
        if(masterDegree == 'Y'){
            return true;
        }else{
            return false;
        }
    }


    public static double calculateTotalCostOfEmployee(int number){
        Employee employee = employeeList.get(number);
        double totalCost = employee.salary() + employee.insurance() + employee.bonus();
        System.out.println("Salary: " + employee.salary() + ", Insurance: " + employee.insurance() + ", Bonus: " + employee.bonus());
        return totalCost;
    }

    public static void listAllEmployee(){
        int i = 0;
        if(employeeList.isEmpty()){
            System.out.println("Employee list is empty...");
        }else{
            for(Employee employee : employeeList){
                System.out.println(i + ". " + employee.getName() + " " +employee.getSurname() + " - " +employee.getClass().toString());
                i++;
            }
        }

    }

    public static void removeAnEmployee(int number){
        System.out.println(employeeList.get(number) + " has been removed...");
        employeeList.remove(number);
    }

    public static void hireNewEmployee(){
        System.out.println("Please choose what type of the Employee...\n" +
                "Enter '1' to choose 'Engineer'\n" +
                "Enter '2' to choose 'Technician'\n" +
                "Enter '3' to choose 'Officer'\n");

        Scanner scanner = new Scanner(System.in);
        int typeOfEmployee = scanner.nextInt();
        switch (typeOfEmployee){
            case 1:
                Scanner scannerForEng = new Scanner(System.in);
                System.out.println("Does Engineer has master degree? Please enter 'Y'/'N'");
                boolean hasMaster = hasMasterDegreeOrJuniorDegree();
                System.out.println("Please enter name of the engineer");
                String name = scannerForEng.nextLine();
                System.out.println("Please enter surname of the engineer");
                String surname = scannerForEng.nextLine();
                System.out.println("Please enter department of bachelor licence...");
                String bachelorDegree = scannerForEng.nextLine();
                System.out.println("Please enter years of experience of the engineer");
                int yearsOfExperience = scannerForEng.nextInt();


                Engineer engineer = new Engineer(name,surname,yearsOfExperience,bachelorDegree,hasMaster);
                System.out.println(engineer + " has been hired and added to 'employeeList'");
                employeeList.add(engineer);
                break;
            case 2:
                Scanner scannerForTech = new Scanner(System.in);
                System.out.println("Does Technician has Junior College degree? Please enter 'Y'/'N'");
                boolean hasJuniorCollege = hasMasterDegreeOrJuniorDegree();
                System.out.println("Please enter name of the technician");
                String nameTechnician = scannerForTech.nextLine();
                System.out.println("Please enter surname of the technician");
                String surnameTechnician = scannerForTech.nextLine();
                System.out.println("Please enter years of experience of the technician");
                int yearsOfExpTechnician = scannerForTech.nextInt();

                Technician technician = new Technician(nameTechnician,surnameTechnician,yearsOfExpTechnician,hasJuniorCollege);
                System.out.println(technician + " has been hired and added to 'employeeList'");
                employeeList.add(technician);
                break;
            case 3:
                Scanner scannerForOfc = new Scanner(System.in);
                System.out.println("Please enter name of the officer");
                String officerName = scannerForOfc.nextLine();
                System.out.println("Please enter surname of the officer");
                String officerSurname = scannerForOfc.nextLine();
                System.out.println("Please enter title of the officer");
                String title = scannerForOfc.nextLine();
                System.out.println("Please enter years of experience of the officer");
                int yearsOfExpOfficer = scannerForOfc.nextInt();


                Officer officer = new Officer(officerName,officerSurname,yearsOfExpOfficer,title);
                System.out.println(officer + " has been hired and added to 'employeeList'");
                employeeList.add(officer);
                break;
            default:
                System.out.println("Please follow instructions exactly... Try again...");
                break;
        }

    }

}
