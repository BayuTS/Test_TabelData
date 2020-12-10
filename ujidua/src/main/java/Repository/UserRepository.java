package Repository;

import org.springframework.data.repository.CrudRepository;
import model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
}
