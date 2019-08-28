package com.practice.springsecuritywithjwt.repository;

import com.practice.springsecuritywithjwt.model.Role;
import com.practice.springsecuritywithjwt.model.RoleName;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

    Optional<Role> findByName(RoleName roleName);

}
