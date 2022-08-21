import javax.persistence.*;


@Entity
public class User {

// should we use firstname,lastname has yet to be decided?
    private String userName;
    private String userPassword;
    private String email;
    private Date joinedAt;
// List of product id's so as to know what items the User bought
    private ArrayList productid;
    
}
