package ie.atu.userreg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{
private final UserService myUserService;
@Autowired
public UserController(UserService myUserService)
{
    this.myUserService = myUserService;
}
    @GetMapping(" /registerUser/{name}/{email}")
    public String findUserinfo(@PathVariable ("name")String name, @PathVariable("email") String email)
{
    return myUserService.findUserinfo(name, email);
}







}
