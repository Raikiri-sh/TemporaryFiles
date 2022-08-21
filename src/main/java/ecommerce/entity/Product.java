import javax.persistence.*;


@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Full Name")
	private String userName;
    private String userPassword;
    private String email;
	
	@CreatedDate
    private Instant createdDate;
	
	@ManyToOne
    @JoinColumn(name = "merchant_id")
    private Merchant merchant;
	/*
	or
	@CreatedBy
    private User user;
  
   */
    
	private String imageurl;
	// this variable is for storing image of product. Only 1 image is enough.
    private int price;
    private int stock; // amount of product that's available
    private String item_desc; // Item description
    
    
}
