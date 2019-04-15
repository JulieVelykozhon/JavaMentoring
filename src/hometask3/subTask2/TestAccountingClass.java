package hometask3.subTask2;

public class TestAccountingClass {

    public static void main(String[] args) {
        Accounting accounting = new Accounting();
        int temp = 0;
        double sum = 0;
        double result = 0;
        accounting.pay(temp, sum);
        System.out.println("Amount of Payment:" + result);
    }
}
