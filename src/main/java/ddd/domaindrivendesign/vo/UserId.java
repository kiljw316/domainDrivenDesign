package ddd.domaindrivendesign.vo;

import lombok.Getter;

import java.util.Objects;

@Getter
public class UserId {

    private final String userId;

    public UserId(String userId) {

        if (userId == null) throw new IllegalArgumentException("값을 입력해주세요");

        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserId userId1 = (UserId) o;
        return Objects.equals(getUserId(), userId1.getUserId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserId());
    }
}
