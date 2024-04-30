package MyInvoice;

import java.util.List;

public interface ItemInnterface {

    double getItemId();

    void setItemId(double itemId);

    String getItemName();

    void setItemName(String itemName);

    double getUnitPrice();

    void setUnitPrice(double unitPrice);

    int getQuantity();

    void setQuantity(int quantity);

    @Override
    String toString();

    default int itemsQuatity(List<MyInvoice.Item> items) {
        int quantity = 0;
        for (MyInvoice.Item i : items) {
            quantity += i.quantity;
        }
        return quantity;
    }
}
