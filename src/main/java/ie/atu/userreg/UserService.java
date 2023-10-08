package ie.atu.userreg;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@Service
public class UserService
{
    /*
    public String findUserinfo(String name, String email)
    {
        return "My email is " + name+email;
    }
*/
    public String UserInfo(UserDetails user)
    {
       String details = "Thank you " + user.getName() + " for your email " + user.getEmail();
       return details;
    }
}
