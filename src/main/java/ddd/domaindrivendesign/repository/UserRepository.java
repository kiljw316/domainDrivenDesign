package ddd.domaindrivendesign.repository;

import ddd.domaindrivendesign.vo.User;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findByName(String userName);

    User save(User user);

    void deleteAll();
}
