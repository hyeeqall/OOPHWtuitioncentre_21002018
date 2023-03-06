import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Tutor {

    // declaring variable for setter and getter
    private String name;
    private String id;
    private String address;
    private String yearsOfExperience;
    private String dateJoined;
    private String numberOfYears;

    Scanner scanner = new Scanner(System.in);
    public void inputTutors(int numTutor){

        //create an object for list tutor
        List<Tutor> tutors = new ArrayList<>();

        for (int i = 1; i <= numTutor; i++) {
            System.out.println("Enter details for tutor " + i);

            System.out.println("The tutor's name is :");
            String nameTutor = scanner.nextLine();

            System.out.println("The tutor's ID :");
            String idTutor = scanner.nextLine();

            System.out.println("The tutor's address :");
            String addTutor = scanner.nextLine();

            System.out.println("The tutor's date joined the tuition center in this format [DD/MM/YYYY] ");
            String djTutor = scanner.nextLine();

            System.out.println("The tutor's years of experience :");
            String yearsexpTutor = scanner.nextLine();

            System.out.println("The tutor's number of year in the tuition center :");
            String yjTutor = scanner.nextLine();

            Tutor tutor = new Tutor();
            tutor.setName(nameTutor);
            tutor.setId(idTutor);
            tutor.setAddress(addTutor);
            tutor.setYearsOfExperience(yearsexpTutor);
            tutor.setDateJoined(djTutor);
            tutor.setNumberOfYears(yjTutor);

            tutors.add(tutor);
        }

        displayTutors(tutors);
    }

    // method of displaying method
    public void displayTutors(List<Tutor> tutors) {
        System.out.println("\nTutor details:");
        for (Tutor tutor : tutors) {
            System.out.println("Name: " + tutor.getName());
            System.out.println("ID: " + tutor.getId());
            System.out.println("Address: " + tutor.getAddress());
            System.out.println("Years of experience: " + tutor.getYearsOfExperience());
            System.out.println("Date joined: " + tutor.getDateJoined());
            System.out.println("Number of years in tuition center: " + tutor.getNumberOfYears());
            System.out.println();
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(String yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(String dateJoined) {
        this.dateJoined = dateJoined;
    }

    public String getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(String numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

}
