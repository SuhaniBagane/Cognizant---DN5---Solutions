import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {

    @Test
    void serviceTest(){

        UserRepository repository=mock(UserRepository.class);

        User user=new User(1L,"Rahul");

        when(repository.findById(1L))
                .thenReturn(Optional.of(user));

        UserService service=new UserService(repository);

        assertNotNull(service.getUserById(1L));

    }

}