import javax.persistence.*;


@Entity
public class Merchant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;
    private String userPassword;
    private String email;
    @CreatedDate
    private Instant joinedAt;
    private int contactNo; // this field is needed so as to contact Merchant directly
// List of product id's so as to know what items the Merchant is selling
    @OneToMany(mappedBy = "merchant", cascade = CascadeType.ALL)
    private List<Product> productList = new ArrayList<>();
    
   public void add(Product product){
        if(product != null){
            if(productList == null){
                productList = new ArrayList<>();
            }
            productList.add(product);
            product.setCustomer(this);
        }
    }
}
