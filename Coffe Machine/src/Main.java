import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter type of coffee:");
        System.out.print("1. Espresso");
        System.out.print("2. Latte");
        System.out.println("3. Cappuccino");
        int choice = sc.nextInt();
        sc.close();
        if (choice == 1) {
            Espresso es = new Espresso(0, 0,0);
            es.prepareCoffee(0,0,0);
        }
        if (choice == 2) {
            Latte latte = new Latte(0, 0,0);
            latte.prepareCoffee(0,0,0);
        }
        if (choice == 3) {
            Cappuccino cappuccino = new Cappuccino(0, 0,0);
            cappuccino.prepareCoffee(0,0,0);
        }
    }
}