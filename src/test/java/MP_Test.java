import com.dao.UserMapper;
import com.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class MP_Test {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void myTest() {

        int row = userMapper.insert(new User(null, "user", "user"));
        System.out.println(row);

        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }

}
