import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // must have this to use built-in input function
        Scanner scanner = new Scanner(System.in);
        //this is where we create an object (some sort of connector) where we use it
        //when we want to call method/funtion from other class
        TuitionCenters tuitionCenter = new TuitionCenters();
        Student student = new Student();
        Tutor tutor = new Tutor();

        //the function/method of creating a tuition center
        tuitionCenter.inputTuitionCenterDetails();


        // entering tutors details
        System.out.println("Enter the number of tutor");
        int numTutor = scanner.nextInt(); // input the number of tutors we want
        scanner.nextLine();
        tutor.inputTutors(numTutor);// calling method of the tutors detail from the Tutor class
        System.out.println("-----------------------------------------------------------------------");

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Enter the number of students: ");
        int numStudents = scanner.nextInt();// // input the number of Student we want
        scanner.nextLine();
        student.inputStudent(numStudents);// calling method of the student detail from the Sudent class
        System.out.println("-----------------------------------------------------------------------");


        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Performance report for tuition center at "+ tuitionCenter.getLocation());
        System.out.println("The name of the headmaster is" + tuitionCenter.getNameHeadmaster());
        System.out.println("The IC of the headmaster is" + tuitionCenter.getIcHeadmaster());
        System.out.println("Number of tutors: " + numTutor);
        System.out.println("Number of students: "+ numStudents);



    }

}