package MyInvoice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class InvoicingSystem {
    private static ShopSettings shopSettings;
    public static List<Item> items = new ArrayList<>();
    private static List<Invoice> invoices = new ArrayList<>();
    static Invoice invoice1 = new Invoice();

    @Override
    public String toString() {
        for (int i = 0; i < items.size(); i++) {
            items.get(i).toString();
        }
        return items.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String a = scanner.nextLine();
        Menue.invoice1.customerFullName = a;

        System.out.println("Enter your phone number: ");
        String phoneNumber = scanner.nextLine();
        Menue.invoice1.phoneNumber = phoneNumber;

        Menue.addItems(scanner);

        Menue.showMainMenu();

    }
}
