package cn.ksdshpx.maven;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/**
 * Create with IntelliJ IDEA
 * Create by peng.x
 * Date: 2017/12/29
 * Time: 10:29
 */

public class MakeFriendsTest {
    @Test
    public void testMakeFriends(){
        MakeFriends makeFriend = new MakeFriends();
        String str = makeFriend.makeFriends("litingwei");
        assertEquals("Hey,John make a friend please.",str);
    }
}
