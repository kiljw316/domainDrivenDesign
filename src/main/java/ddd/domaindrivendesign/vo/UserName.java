package ddd.domaindrivendesign.vo;

public class UserName {

    private String username;

    public UserName(String username) {

        if (username == null) throw new IllegalArgumentException("반드시 이름을 입력해주세요.");
        if (username.length() < 3) throw new IllegalArgumentException("사용자명은 3글자 이상이어야 함");

        this.username = username;
    }
}
