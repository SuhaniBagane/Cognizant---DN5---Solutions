import java.util.Optional;
import java.util.List;

public interface UserRepository {

    Optional<User> findById(Long id);

    User save(User user);

    List<User> findByName(String name);

}