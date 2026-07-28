public class UserController {

    private UserService service;

    public UserController(UserService service){

        this.service=service;

    }

    public User getUser(Long id){

        return service.getUserById(id);

    }

}