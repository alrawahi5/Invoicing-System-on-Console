package MyInvoice;

import java.util.Date;
import java.util.Scanner;

public class Menue {
    //ShopSettings shopSettings1 = new ShopSettings();
    static void showMainMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Main Menu:");
            System.out.println("1. Shop Settings");
            System.out.println("2. Manage Shop Items");
            System.out.println("3. Create New Invoice");
            System.out.println("4. Report: Statistics");
            System.out.println("5. Report: All Invoices");
            System.out.println("6. Search Invoices");
            System.out.println("7. Program Statistics");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    shopSettingsMenu(scanner);
                    break;
                case 2:
                    manageShopItemsMenu(scanner);
                    break;
                case 3:
                    createNewInvoice(scanner);
                    break;
                case 4:
                    reportStatistics();
                    break;
                case 5:
                    reportAllInvoices();
                    break;
                case 6:
                    searchInvoices(scanner);
                    break;
                case 7:
                    programStatistics();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    static void shopSettingsMenu(Scanner scanner) {
        while (true) {
            System.out.println("Shop Settings Menu:");
            System.out.println("1. Load Data (Items and Invoices)");
            System.out.println("2. Set Shop Name");
            System.out.println("3. Set Invoice Header (Tel / Fax / Email / Website)");
            System.out.println("4. Go Back");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice) {
                case 1:
                    loadData(scanner); //
                    break;
                case 2:
                    setShopName(scanner);
                    break;
                case 3:
                    setInvoiceHeader(scanner);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    static void manageShopItemsMenu(Scanner scanner) {
        while (true) {
            System.out.println("Manage Shop Items Menu:");
            System.out.println("1. Add Items");
            System.out.println("2. Delete Items");
            System.out.println("3. Change MyInvoice.Item Price");
            System.out.println("4. Report All Items");
            System.out.println("5. Go Back");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addItems(scanner);
                    break;
                case 2:
                    deleteItems(scanner);
                    break;
                case 3:
                    changeItemPrice(scanner);
                    break;
                case 4:
                    reportAllItems();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    static ShopSettings shopSettings1 = new ShopSettings();
    static Invoice invoice1 = new Invoice();
    static Item item1 = new Item();
    static Menue menu1 = new Menue();
    static InvoicingSystem invoSy1 = new InvoicingSystem();

    static void createNewInvoice(Scanner scanner) {

    }

    static void reportStatistics() {

    }

    static void reportAllInvoices() {

    }

    static void searchInvoices(Scanner scanner) {

    }

    static void programStatistics() {

    }

    static void setShopName(Scanner scanner) {
        //ShopSettings shopSettings1 = new ShopSettings();
        scanner = new Scanner(System.in);
        String a;
        a = scanner.nextLine();
        shopSettings1.shopName = a;
        //scanner.close();
    }


    static void loadData(Scanner scanner) {
        System.out.println("Shop name is: " + shopSettings1.shopName);
        //invoice1.invoiceNo = Randome
        System.out.println("Invoice No is: " + invoice1.invoiceNo);

        System.out.println("Customer name is: " + invoice1.customerFullName);

        System.out.println("Customer phone number: " + invoice1.phoneNumber);

        Date invoDate = new Date();
        invoice1.invoiceDate = invoDate;
        System.out.println("Invoice date: " + invoDate);

        for (Item i : invoice1.items) {
            System.out.println("Added Items: " + i.toString());
        }

        //use the random class for the item amount then sum them up
        System.out.println("The total amout: " + invoice1.totalAmount);

        System.out.println("The paid amount is: " + invoice1.paidAmount);


    }

    static void setInvoiceHeader(Scanner scanner) {

    }

    static void addItems(Scanner scanner) {

    }

    static void deleteItems(Scanner scanner) {

    }

    static void changeItemPrice(Scanner scanner) {

    }

    static void reportAllItems() {

    }
}


