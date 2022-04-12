package ddd.domaindrivendesign.vo;

import lombok.Getter;

import java.util.UUID;

@Getter
public class User {

    private final UserId id;
    private UserName name;

    public User(UserName name) {

        if (name == null) throw new IllegalArgumentException();

        this.id = new UserId(UUID.randomUUID().toString());
        this.name = name;
    }

    public void changeUserName(UserName name) {
        if (name == null) throw new IllegalArgumentException("name 이 비었습니다.");
        if (name.getUsername().length() < 3) throw new IllegalArgumentException("사용자명은 3글자 이상이어야 함");

        this.name = name;
    }

    public static void check(User leftUser, User rightUser) {
        if (leftUser.equals(rightUser)) {
            System.out.println("동일한 사용자 입니다.");
            return;
        }
        System.out.println("서로 다른 사용자입니다.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return id != null ? id.getUserId().equals(user.id.getUserId()) : user.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
