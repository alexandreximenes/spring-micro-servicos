package com.start.microservicos.repositories;

import com.start.microservicos.models.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {

    public ApplicationUser findByUsername(String username);
}
