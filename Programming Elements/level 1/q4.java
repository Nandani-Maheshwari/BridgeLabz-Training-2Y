import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter cost_price:");
        double cost_price = sc.nextDouble();
        System.out.print("Enter sell_price:");
        double sell_price = sc.nextDouble();
        double profit = sell_price - cost_price;
        double profit_percentage = profit / cost_price * (double)100.0F;
        System.out.println("The profit_percentage is:" + profit_percentage);
        double loss = cost_price - sell_price;
        double loss_percentage = loss / sell_price * (double)100.0F;
        System.out.println("The loss_percentage is:" + loss_percentage);
    }
}
