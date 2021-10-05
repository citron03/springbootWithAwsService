package org.example.web.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    // 이미 가입된 유저인지 새로이 가입하는 유저인지 판별하기 위해서 만듦.
    Optional<User> findByEmail(String email);

}
