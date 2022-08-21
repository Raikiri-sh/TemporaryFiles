import javax.persistence.*;


@Entity
public class Merchant {

// should we use firstname,lastname has yet to be decided?
    private String userName;
    private String userPassword;
    private String email;
    private Date joinedAt;
    private int contactNo; // this field is needed so as to contact Merchant directly
// List of product id's so as to know what items the Merchant is selling
    private ArrayList productid;
    
    
}
