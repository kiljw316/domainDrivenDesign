package ddd.domaindrivendesign.vo;

public class UserId {

    private String userId;

    public UserId(String userId) {
        if (userId == null) throw new IllegalArgumentException("값을 입력해주세요");
        this.userId = userId;
    }
}
