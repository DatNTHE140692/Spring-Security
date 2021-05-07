package vn.ghtk.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.ghtk.springsecurity.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
