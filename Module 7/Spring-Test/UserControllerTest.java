import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class UserControllerTest {

    @Test
    void testController(){

        UserRepository repository=mock(UserRepository.class);

        UserService service=new UserService(repository);

        UserController controller=new UserController(service);

        assertNotNull(controller);

    }

}