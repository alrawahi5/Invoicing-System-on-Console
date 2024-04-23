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

    public static ShopSettings getShopSettings() {
        return shopSettings;
    }

    public static void setShopSettings(ShopSettings shopSettings) {
        InvoicingSystem.shopSettings = shopSettings;
    }

    public static List<Item> getItems() {
        return items;
    }

    public static void setItems(List<Item> items) {
        InvoicingSystem.items = items;
    }

    public static List<Invoice> getInvoices() {
        return invoices;
    }

    public static void setInvoices(List<Invoice> invoices) {
        InvoicingSystem.invoices = invoices;
    }

    public static Invoice getInvoice1() {
        return invoice1;
    }

    public static void setInvoice1(Invoice invoice1) {
        InvoicingSystem.invoice1 = invoice1;
    }

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
        invoice1.setCustomerFullName(a);

        System.out.println("Enter your phone number: ");
        String phoneNumber = scanner.nextLine();
        Menue.invoice1.phoneNumber = phoneNumber;
        invoice1.setPhoneNumber(phoneNumber); 

        Menue.addItems(scanner);

        Menue.showMainMenu();

    }
}
