import org.junit.jupiter.api.Test;

import java.util.List;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class UserRepositoryTest {

    @Test
    void testCustomQuery(){

        UserRepository repository=
                mock(UserRepository.class);

        when(repository.findByName("Rahul"))
                .thenReturn(List.of(new User(1L,"Rahul")));

        assertEquals(1,
                repository.findByName("Rahul").size());

    }

}