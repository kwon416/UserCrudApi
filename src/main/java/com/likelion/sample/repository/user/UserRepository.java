package com.likelion.sample.repository.user;

import com.likelion.sample.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    //옵셔널클래스라고 불리며,
    // NullPointException 이 일어날 수 있는 값을 감싸는
    // Wrapper 클래스로 값이 null 이라도 NPE 가 발생하지 않게 해준다.
    Optional<User> findByName(String name);
}
