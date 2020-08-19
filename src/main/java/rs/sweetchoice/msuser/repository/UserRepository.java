package rs.sweetchoice.msuser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rs.sweetchoice.msuser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
