import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yuho on 2018/02/01.
 */
public class UserTest {

    private User user;

    @Before
    public void setUp() throws Exception {
        String fname = "yuho";
        String lname = "ito";
        String email = "yuho.ito@example.vom";
        this.user = new User(fname, lname, email);
    }

    @Test
    public void testValidate() throws Exception {
        assertTrue(this.user.Validate());
    }

    @Test
    public void testAgeCatUp() throws Exception {
        this.user.age = 20;
        assertTrue(this.user.ageCat().equals("成人"));
    }

    @Test
    public void testAgeCatDown() throws Exception {
        this.user.age = 19;
        assertTrue(this.user.ageCat().equals("未成年"));
    }
}