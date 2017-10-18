package validpriceproject.entity;
// Generated Sep 28, 2016 12:20:37 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Product generated by hbm2java
 */
public class Product  implements java.io.Serializable {


     private long barcode;
     private int pid;
     private String name;
     private BigDecimal currentPrice;
     private BigDecimal previousPrice;
     private short balance;
     private Date modificationDate;
     private long ledId;

    public Product() {
    }

	
    public Product(long barcode, int pid, String name, BigDecimal currentPrice, BigDecimal previousPrice, short balance, long ledId) {
        this.barcode = barcode;
        this.pid = pid;
        this.name = name;
        this.currentPrice = currentPrice;
        this.previousPrice = previousPrice;
        this.balance = balance;
        this.ledId = ledId;
    }
    public Product(long barcode, int pid, String name, BigDecimal currentPrice, BigDecimal previousPrice, short balance, Date modificationDate, long ledId) {
       this.barcode = barcode;
       this.pid = pid;
       this.name = name;
       this.currentPrice = currentPrice;
       this.previousPrice = previousPrice;
       this.balance = balance;
       this.modificationDate = modificationDate;
       this.ledId = ledId;
    }
   
    public long getBarcode() {
        return this.barcode;
    }
    
    public void setBarcode(long barcode) {
        this.barcode = barcode;
    }
    public int getPid() {
        return this.pid;
    }
    
    public void setPid(int pid) {
        this.pid = pid;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public BigDecimal getCurrentPrice() {
        return this.currentPrice;
    }
    
    public void setCurrentPrice(BigDecimal currentPrice) {
        this.currentPrice = currentPrice;
    }
    public BigDecimal getPreviousPrice() {
        return this.previousPrice;
    }
    
    public void setPreviousPrice(BigDecimal previousPrice) {
        this.previousPrice = previousPrice;
    }
    public short getBalance() {
        return this.balance;
    }
    
    public void setBalance(short balance) {
        this.balance = balance;
    }
    public Date getModificationDate() {
        return this.modificationDate;
    }
    
    public void setModificationDate(Date modificationDate) {
        this.modificationDate = modificationDate;
    }
    public long getLedId() {
        return this.ledId;
    }
    
    public void setLedId(long ledId) {
        this.ledId = ledId;
    }




}

