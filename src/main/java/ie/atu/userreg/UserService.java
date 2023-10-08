package ie.atu.userreg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService
{
    public String findUserinfo(String name, String email)
    {
        return name + email;
    }
}
