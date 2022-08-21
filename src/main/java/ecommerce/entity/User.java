import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Full Name")
	private String userName;
	
    private String userPassword;
	
    private String email;
	
    @CreatedDate
    private Instant joinedAt;
	
}
