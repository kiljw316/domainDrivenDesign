package ddd.domaindrivendesign.service;

import ddd.domaindrivendesign.repository.UserRepository;
import ddd.domaindrivendesign.vo.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean exists(User user) {

        Optional<User> findUser = userRepository.findByName(user.getName().getUsername());

        return findUser.isPresent();
    }
}
