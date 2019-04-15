package hometask3.subTask2;

public class Accounting {
    int numberOfWorkingHours = 0;
    double perHourRate = 0.0;
    double calculatedPayment;
    public double pay(int numberOfWorkingHours, double perHourRate){

        calculatedPayment = perHourRate * numberOfWorkingHours;

        return calculatedPayment;
    }

    public int getNumberOfWorkingHours() {
        return numberOfWorkingHours;
    }
}
