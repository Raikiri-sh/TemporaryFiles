import javax.persistence.*;


@Entity
public class Product {

// should we use firstname,lastname has yet to be decided?
    private String userName;
    private String userPassword;
    private String email;
    private Date createdAt;
  //private String imageurl; this variable is for storing image of product. Only 1 image is enough.
    private int price;
    private int stock; // amount of product that's available
    private String item_desc; // Item description
    
    
}
