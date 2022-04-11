package ddd.domaindrivendesign;

import ddd.domaindrivendesign.vo.User;
import ddd.domaindrivendesign.vo.UserId;

public class Main {
    public static void main(String[] args) {
        User user = new User(new UserId("hello"), "helloUser");
        User user1 = new User(new UserId("world"), "worldUser");
        User user2 = new User(new UserId("hello"), "worldUser");
        User user3 = new User(new UserId("hello"), "helloUser");

        System.out.println("====================");
        User.check(user, user1);
        System.out.println("====================");
        User.check(user, user2);
        System.out.println("====================");
        User.check(user, user3);
        System.out.println("====================");
        User.check(user1, user2);
        System.out.println("====================");
    }
}
