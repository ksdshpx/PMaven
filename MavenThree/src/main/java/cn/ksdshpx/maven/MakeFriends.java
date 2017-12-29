package cn.ksdshpx.maven;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2017/12/29
 * Time: 10:28
 */
public class MakeFriends {
    public String makeFriends(String name) {
        HelloFriend friend = new HelloFriend();
        friend.sayHelloToFriend("litingwei");
        String str = "Hey," + friend.getMyName() + " make a friend please.";
        System.out.println(str);
        return str;
    }
}
