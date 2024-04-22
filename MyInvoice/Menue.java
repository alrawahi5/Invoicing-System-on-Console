package MyInvoice;

import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class Menue {
    //ShopSettings shopSettings1 = new ShopSettings();
    static int count1 = 1;

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
            System.out.println("3. Change Item Price");
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
        InvoicingSystem.main(null);
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

        System.out.println("The total amout: " + invoice1.totalAmount);

        System.out.println("The paid amount is: " + invoice1.paidAmount);


    }

    static void setInvoiceHeader(Scanner scanner) {

    }

    static void addItems(Scanner scanner) {

        while (true) {
            System.out.println("What are you buying? When you are done, type " + "done ");
            String input = scanner.nextLine();
            if (input.equals("done")) {
                break;
            }
            Item obj = new Item();
            obj.itemName = input;
            obj.itemId = (int) (Math.random() * (253 - 1 + 1) + 1);
            obj.unitPrice = (int) (Math.random() * (5 - 1 + 1) + 1);
            System.out.println("How many " + obj.itemName + " do you want? ");
            obj.quantity = scanner.nextInt();
            scanner.nextLine();

            invoSy1.items.add(obj);
        }
        Menue.invoice1.items = invoSy1.items;
        invoSy1.items.toString();
    }

    static void deleteItems(Scanner scanner) {

    }

    static void changeItemPrice(Scanner scanner) {
        HashMap<Double, Item> itemHashMap = new HashMap<>();

        for (Item i : InvoicingSystem.items) {
            itemHashMap.put(i.itemId, i);
        }
        System.out.println("Choose the item that you want to change its price: ");

        for (Item element : InvoicingSystem.items) {
            System.out.println(element.itemId + "-- " + "Item name is: " + element.itemName + " and its current price is; " + element.unitPrice);
            count1++;
        }

        System.out.print("Enter your choice: ");
        Double choice = scanner.nextDouble();
        scanner.nextLine();
//        if (choice == count1) {
//            for (Item element : InvoicingSystem.items) {
//                element.unitPrice = (int) (Math.random() * (9 - 7 + 1) + 7);
//                System.out.println(count1 + "-- " + "Item is: " + element.itemName + " and its changed price is; " + element.unitPrice);
//            }
//            System.out.println("Invalid choice, please try again.");
//        }

        if (itemHashMap.containsKey(choice)) {
            Item itemObjToChange = itemHashMap.get(choice);
            System.out.println("Original Item: " + itemObjToChange.toString());
            itemObjToChange.unitPrice = (int) (Math.random() * (9 - 7 + 1) + 7);
            System.out.println("Modified Item: " + itemObjToChange.toString());

            itemHashMap.remove(choice);
            itemHashMap.put(itemObjToChange.itemId, itemObjToChange);
            InvoicingSystem.items = itemHashMap.values().stream().toList();

            for (Item element : InvoicingSystem.items) {
                System.out.println(element.itemId + "-- " + "Item name is: " + element.itemName + " and its changed price is; " + element.unitPrice);
            }
        }
    }

    static void reportAllItems() {

    }
}


