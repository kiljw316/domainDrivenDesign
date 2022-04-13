package ddd.domaindrivendesign.repository;

import ddd.domaindrivendesign.vo.User;
import ddd.domaindrivendesign.vo.UserId;
import ddd.domaindrivendesign.vo.UserName;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class MemoryUserRepository implements UserRepository {

    private static final Map<UserId, User> store = new HashMap<>();

    @Override
    public Optional<User> findByName(String userName) {

        return store.values()
                .stream()
                .filter(user -> user.getName().equals(new UserName(userName)))
                .findFirst();
    }

    @Override
    public User save(User user) {
        return store.put(user.getId(), user);
    }

    @Override
    public void deleteAll() {
        store.clear();
    }
}
