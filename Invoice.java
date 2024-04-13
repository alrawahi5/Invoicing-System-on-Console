import java.util.Date;
import java.util.List;

public class Invoice {
    private int invoiceNo;
    private String customerFullName;
    private String phoneNumber;
    private Date invoiceDate;
    private List<Item> items;
    private double totalAmount;
    private double paidAmount;
    private double balance;
    // anything else..?
}
