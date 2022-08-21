import javax.persistence.*;

// This class is used in Admin dashboard to see all the sales that have occured in the site
@Entity
public class SoldProducts{

    private String merchantName;
    private String productName;
    private String buyersName;
    private float soldprice;
    private int soldAmount;
    private Date soldDate;
    private int productid;
    
}
