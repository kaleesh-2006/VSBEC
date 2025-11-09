import java.util.Scanner;

public class HotelMenuSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        int idly = 0, dosa = 0, poori = 0, chapati = 0, biryani = 0;
        int friedRice = 0, noodles = 0, coffee = 0, tea = 0, juice = 0;

        while (true) {
            System.out.println("\n===== WELCOME TO INDIAN HOTEL =====");
            System.out.println("1. View Menu");
            System.out.println("2. Choose Food");
            System.out.println("3. View Current Order");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n------ MENU ------");
                    System.out.println("1. Idly           - Rs.10");
                    System.out.println("2. Dosa           - Rs.30");
                    System.out.println("3. Poori          - Rs.40");
                    System.out.println("4. Chapati        - Rs.35");
                    System.out.println("5. Veg Biryani    - Rs.90");
                    System.out.println("6. Fried Rice     - Rs.80");
                    System.out.println("7. Noodles        - Rs.70");
                    System.out.println("8. Coffee         - Rs.15");
                    System.out.println("9. Tea            - Rs.10");
                    System.out.println("10. Fresh Juice   - Rs.40");
                    System.out.println("------------------");
                    break;

                case 2:
                    System.out.print("\nEnter food number (1–10): ");
                    int food = sc.nextInt();
                    System.out.print("Enter quantity: ");
                    int qty = sc.nextInt();

                    if (food == 1) idly += qty;
                    else if (food == 2) dosa += qty;
                    else if (food == 3) poori += qty;
                    else if (food == 4) chapati += qty;
                    else if (food == 5) biryani += qty;
                    else if (food == 6) friedRice += qty;
                    else if (food == 7) noodles += qty;
                    else if (food == 8) coffee += qty;
                    else if (food == 9) tea += qty;
                    else if (food == 10) juice += qty;
                    else {
                        System.out.println("Invalid food number!");
                        break;
                    }
                    System.out.println("✅ Item added to your order!");
                    break;

                case 3:
                    System.out.println("\n===== CURRENT ORDER =====");
                    double total = 0;
                    if (idly > 0) { System.out.println("Idly x" + idly + " = Rs." + (idly * 10)); total += idly * 10; }
                    if (dosa > 0) { System.out.println("Dosa x" + dosa + " = Rs." + (dosa * 30)); total += dosa * 30; }
                    if (poori > 0) { System.out.println("Poori x" + poori + " = Rs." + (poori * 40)); total += poori * 40; }
                    if (chapati > 0) { System.out.println("Chapati x" + chapati + " = Rs." + (chapati * 35)); total += chapati * 35; }
                    if (biryani > 0) { System.out.println("Veg Biryani x" + biryani + " = Rs." + (biryani * 90)); total += biryani * 90; }
                    if (friedRice > 0) { System.out.println("Fried Rice x" + friedRice + " = Rs." + (friedRice * 80)); total += friedRice * 80; }
                    if (noodles > 0) { System.out.println("Noodles x" + noodles + " = Rs." + (noodles * 70)); total += noodles * 70; }
                    if (coffee > 0) { System.out.println("Coffee x" + coffee + " = Rs." + (coffee * 15)); total += coffee * 15; }
                    if (tea > 0) { System.out.println("Tea x" + tea + " = Rs." + (tea * 10)); total += tea * 10; }
                    if (juice > 0) { System.out.println("Fresh Juice x" + juice + " = Rs." + (juice * 40)); total += juice * 40; }

                    if (total == 0)
                        System.out.println("🛒 Your order is empty!");
                    else
                        System.out.println("------------------\nCurrent Total: Rs." + total);
                    break;

                case 4:
                    System.out.println("\n===== BILL RECEIPT =====");
                    double finalTotal = (idly * 10) + (dosa * 30) + (poori * 40) + (chapati * 35) +
                            (biryani * 90) + (friedRice * 80) + (noodles * 70) + (coffee * 15) +
                            (tea * 10) + (juice * 40);

                    if (finalTotal == 0) {
                        System.out.println("No items in your order!");
                    } else {
                        System.out.println("Your total bill is Rs." + finalTotal);
                        System.out.println("Thank you for dining with us! 🍽️");
                        // Reset order
                        idly = dosa = poori = chapati = biryani = friedRice = noodles = coffee = tea = juice = 0;
                    }
                    break;

                case 5:
                    System.out.println("🙏 Thank you! Visit again! 😊");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
