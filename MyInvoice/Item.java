package MyInvoice;

public class Item {
    public double itemId;
    public String itemName;
    public double unitPrice;
    public int quantity;

    @Override
    public String toString() {
        return "Item{" +
                "itemId='" + itemId + '\'' +
                ", itemName='" + itemName + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                '}';
    }

    // add anything else? ...
}
