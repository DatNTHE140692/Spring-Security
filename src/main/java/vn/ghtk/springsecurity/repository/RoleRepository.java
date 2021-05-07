package vn.ghtk.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.ghtk.springsecurity.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
