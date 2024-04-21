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
        for (int i = 0; i<items.size(); i++){
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

        System.out.println("What are you buying? When you are done, type " + "done ");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("done")) {
                break;
            }
            Item obj = new Item();
            obj.itemName = input;
            obj.itemId = (int)(Math.random() * (253 - 1 + 1) + 1);
            obj.unitPrice = (int)(Math.random() * (5 - 1 + 1) + 1);

            for(int i = 0; i<items.size(); i++){
                System.out.println("How many " + input +" do you want? ");
                obj.quantity = scanner.nextInt();

            }

            items.add(obj);
        }
        Menue.invoice1.items = items;
        items.toString();

        Menue.showMainMenu();

    }
}
