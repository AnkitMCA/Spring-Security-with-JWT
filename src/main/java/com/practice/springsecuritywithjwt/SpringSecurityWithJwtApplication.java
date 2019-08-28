package com.practice.springsecuritywithjwt;

import com.practice.springsecuritywithjwt.model.Role;
import com.practice.springsecuritywithjwt.model.RoleName;
import com.practice.springsecuritywithjwt.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecurityWithJwtApplication implements CommandLineRunner {

    @Autowired
    RoleRepository roleRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityWithJwtApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Role role = new Role();
        role.setName(RoleName.ROLE_USER);
        roleRepository.save(role);
        Role role2 = new Role();
        role2.setName(RoleName.ROLE_ADMIN);
        roleRepository.save(role2);
    }
}
