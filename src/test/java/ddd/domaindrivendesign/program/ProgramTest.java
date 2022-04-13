package ddd.domaindrivendesign.program;

import ddd.domaindrivendesign.repository.MemoryUserRepository;
import ddd.domaindrivendesign.service.UserService;
import ddd.domaindrivendesign.vo.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

class ProgramTest {

    private final MemoryUserRepository userRepository = new MemoryUserRepository();
    private final UserService userService = new UserService(userRepository);
    private final Program program = new Program(userRepository, userService);

    @AfterEach
    void afterEach() {
        userRepository.clear();
    }

    @Test
    void 사용자_생성() throws Exception {

        //given
        String userName = "길재원";

        //when
        program.createUser(userName);

        //then
        Optional<User> findUser = userRepository.findByName(userName);

        assertThat(findUser.get().getName().getUsername()).isEqualTo(userName);
    }
}