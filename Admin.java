import javax.persistence.*;

// This class might not be needed if there is only single Admin in the site.
@Entity
public class Admin {

// should we use firstname,lastname has yet to be decided?
    private String userName;
    private String userPassword;
    private String email;
    private Date joinedAt;

    
}
