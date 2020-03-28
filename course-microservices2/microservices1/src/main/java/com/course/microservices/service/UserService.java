package com.course.microservices.service;

import com.course.microservices.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    User findyById(Long id);

    List<String> findyByIdIn(List<Long> ids);
}
