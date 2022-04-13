package ddd.domaindrivendesign.program;

import ddd.domaindrivendesign.repository.UserRepository;
import ddd.domaindrivendesign.service.UserService;
import ddd.domaindrivendesign.vo.User;
import ddd.domaindrivendesign.vo.UserName;
import lombok.RequiredArgsConstructor;

public class Program {

    private final UserRepository userRepository;
    private final UserService userService;

    public Program(UserRepository userRepository, UserService userService) {
        this.userRepository = userRepository;
        this.userService = userService;
    }

    public void createUser(String userName) {
        User user = new User(
                new UserName(userName)
        );

        if (userService.exists(user)) {
            throw new IllegalArgumentException(userName + "은 이미 존재하는 사용자명임");
        }

        userRepository.save(user);
    }
}
