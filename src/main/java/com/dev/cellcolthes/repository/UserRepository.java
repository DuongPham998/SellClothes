package com.dev.cellcolthes.repository;

import com.dev.cellcolthes.model.entity.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findUsersByUserId(long userId);
    Long countByUserIdIsNotNull();
    List<User> findAllByUserName(String userName, Pageable pageable);
}
