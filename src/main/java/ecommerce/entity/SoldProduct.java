import javax.persistence.*;

// This class is used in Admin dashboard to see all the sales that have occured in the site
@Entity
@Table(name = "Sold products")
public class SoldProducts{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name")
	private String name;
    private String merchantName;
    private String productName;
    private String buyersName;
    private decimal soldprice;
    private int productid;
	private int soldAmount;
	
	@CreatedDate
    private Instant soldDate;
   
    
}
