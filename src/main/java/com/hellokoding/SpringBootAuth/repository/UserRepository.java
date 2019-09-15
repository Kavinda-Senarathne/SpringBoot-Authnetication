package com.hellokoding.SpringBootAuth.repository;

        import com.hellokoding.SpringBootAuth.model.User;
        import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}