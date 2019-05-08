package hometask3.subTask2;

public class Accounting {
    int numberOfWorkingHours;
    double perHourRate;
    double calculatedPayment;
    public static void pay(int numberOfWorkingHours, double perHourRate){

        double calculatedPayment = perHourRate * numberOfWorkingHours;
        System.out.println(calculatedPayment);

    }

    public int getNumberOfWorkingHours() {
        return numberOfWorkingHours;
    }
}
