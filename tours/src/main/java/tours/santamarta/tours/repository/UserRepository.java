package tours.santamarta.tours.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tours.santamarta.tours.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
