package ddd.domaindrivendesign.repository;

import ddd.domaindrivendesign.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JpaUserRepository extends JpaRepository<User, Long> {
    void deleteAll();

    Optional<User> findById(Long id);

    Optional<User> findByName(String name);
}
