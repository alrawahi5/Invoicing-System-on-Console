package MyInvoice;

import java.util.Date;
import java.util.List;

public class Invoice {
    public int invoiceNo;
    public String customerFullName;
    public String phoneNumber;
    public Date invoiceDate;
    public List<Item> items;
    public double totalAmount;
    public double paidAmount;
    public double balance;
    // anything else..?
}
