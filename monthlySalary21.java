import java.util.Scanner;
public class monthlySalary21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hoursWorked;
        double hourlyWage, basicSalary, bonus, totalSalary, tax, netSalary;

        System.out.println("Enter the number of hours worked: ");
        hoursWorked = input.nextInt();
        System.out.println("Enter the hourly wage: ");
        hourlyWage = input.nextDouble();

        basicSalary = hoursWorked * hourlyWage;
        bonus = basicSalary * 0.1;
        totalSalary = basicSalary + bonus;
        tax = 0.05 * totalSalary;
        netSalary = totalSalary - tax;

        System.out.println("The monthly salary is Rp" + netSalary);
    }
}
