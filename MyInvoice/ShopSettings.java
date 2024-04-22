package MyInvoice;

import java.util.*;

public class ShopSettings {
    public String shopName;
    private String invoiceHeader;
    //... add something?

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getInvoiceHeader() {
        return invoiceHeader;
    }

    public void setInvoiceHeader(String invoiceHeader) {
        this.invoiceHeader = invoiceHeader;
    }

    @Override
    public String toString() {
        return "ShopSettings{" +
                "shopName='" + shopName + '\'' +
                ", invoiceHeader='" + invoiceHeader + '\'' +
                '}';
    }
}
 