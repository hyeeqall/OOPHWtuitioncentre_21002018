import java.util.Scanner;
public class TuitionCenters {

    //Declaring variable to use the setter and getter
    private String location;
    private String nameHeadmaster;
    private String icHeadmaster;

    //method for creating the tuition center
    public void inputTuitionCenterDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("The Location of the new tuition centers :");
        setLocation(scanner.nextLine());

        System.out.println("The name of the head master :");
        setNameHeadmaster(scanner.nextLine());

        System.out.println("The ic number of the headmaster :");
        setIcHeadmaster(scanner.nextLine());
    }

    // setter and getter
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getNameHeadmaster() {
        return nameHeadmaster;
    }

    public void setNameHeadmaster(String nameHeadmaster) {
        this.nameHeadmaster = nameHeadmaster;
    }

    public String getIcHeadmaster() {
        return icHeadmaster;
    }

    public void setIcHeadmaster(String icHeadmaster) {
        this.icHeadmaster = icHeadmaster;
    }


}


