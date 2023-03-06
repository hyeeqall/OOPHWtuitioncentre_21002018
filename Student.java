import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Student {
    Scanner scanner = new Scanner(System.in);

    //declaring variable for setter and getter
    private double average;
    private double minimum;
    private double maximum;

    // method to get student details and calculation of avg,min,max
    public void inputStudent(int numStudents) {

        // declaring the Array List
        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<String> icList = new ArrayList<>();
        ArrayList<String> addressList = new ArrayList<>();
        ArrayList<Integer> yearList = new ArrayList<>();
        ArrayList<String> schoolList = new ArrayList<>();
        ArrayList<Double> scoreList = new ArrayList<>();


        // loop for the student details
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter the name of student:");
            String nameStud = scanner.nextLine();
            System.out.println("Enter the IC of student:");
            String icStud = scanner.nextLine();
            System.out.println("Enter the address of student:");
            String addressStud = scanner.nextLine();
            System.out.println("Enter the year of student:");
            int yearStud = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter the school name of student:");
            String schoolnamestud = scanner.nextLine();

            // get the number of test taken by the student
            System.out.println("Enter the number of tests for student:");
            int numtestStud = scanner.nextInt();
            scanner.nextLine();

            // get the marks/scores taken by student for each test
            for(int j = 0; j < numtestStud ; j++) {
                System.out.println("Enter score for test " + (j+1) + ":");
                double score = scanner.nextDouble();
                scanner.nextLine();
                scoreList.add(score);
            }

            // Call methods to calculate average, minimum, and maximum scores
            double average = calculateAverage(scoreList);
            double minimum = calculateMinimum(scoreList);
            double maximum = calculateMaximum(scoreList);

            // Set the values for the corresponding properties
            setAverage(average);
            setMinimum(minimum);
            setMaximum(maximum);

            // Print out the results
            System.out.println("Results for student " + nameStud + ":");
            System.out.println("Average score: " + average);
            System.out.println("Minimum score: " + minimum);
            System.out.println("Maximum score: " + maximum);

            // Clear the scoreList for the next student
            scoreList.clear();
        }
    }

    //average calculation method
    public double calculateAverage(ArrayList<Double> scoreList) {
        double sum = 0;
        for (int i=0 ; i < scoreList.size(); i++) {
            sum+=scoreList.get(i);
        }
        double average = sum / scoreList.size();
        return average;
    }

    //minimum calculation method
    public double calculateMinimum(ArrayList<Double> scoreList) {
        double min = Collections.min(scoreList);
        return min;
    }

    //maximum calculation method
    public double calculateMaximum(ArrayList<Double> scoreList) {
        double max = Collections.max(scoreList);
        return max;
    }

    //setter and getter
    public void setAverage(double average) {
        this.average = average;
    }

    public double getAverage() {
        return average;
    }

    public void setMinimum(double minimum) {
        this.minimum = minimum;
    }

    public double getMinimum() {
        return minimum;
    }

    public void setMaximum(double maximum) {
        this.maximum = maximum;
    }

    public double getMaximum() {
        return maximum;
    }


}
