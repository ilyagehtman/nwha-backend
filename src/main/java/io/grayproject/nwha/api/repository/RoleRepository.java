package io.grayproject.nwha.api.repository;

import io.grayproject.nwha.api.entity.ERole;
import io.grayproject.nwha.api.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author Ilya Avkhimenya
 */
public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findRoleByName(ERole name);
}