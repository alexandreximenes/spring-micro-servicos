package com.course.microservices.repository;

import com.course.microservices.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);

    @Query("select u.name from User u where u.id in(:pIdList)")
    Optional<List<String>> findyIdList(@Param("pIdList") List<Long> idList);

}
