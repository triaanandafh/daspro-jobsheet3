import java.util.Scanner;
public class electricityBill21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double electricityUsage, totalBill;

        System.out.println("Enter electericity usage in kWh: ");
        electricityUsage = input.nextDouble();

        totalBill = electricityUsage * 1500;

        if (electricityUsage > 500) {
            System.out.println("Your electricity usage exceeds 500 kWh.");
        }

        System.out.println("Total electricity bill: Rp" + totalBill);
    }
}
