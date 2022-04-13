package ddd.domaindrivendesign.vo;

import lombok.Getter;

import java.util.Objects;

@Getter
public class UserName {

    private final String username;

    public UserName(String username) {

        if (username == null) throw new IllegalArgumentException("반드시 이름을 입력해주세요.");
        if (username.length() < 3) throw new IllegalArgumentException("사용자명은 3글자 이상이어야 함");

        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserName userName = (UserName) o;
        return Objects.equals(getUsername(), userName.getUsername());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUsername());
    }
}
