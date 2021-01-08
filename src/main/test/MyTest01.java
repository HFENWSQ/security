import cn.qianyan.beans.User;
import cn.qianyan.dao.PerManaDao;
import cn.qianyan.service.PerMangeService;
import cn.qianyan.service.loginService;
import cn.qianyan.utils.pageBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class MyTest01 {

    @Autowired
    private loginService loginService;
    @Autowired
    private PerManaDao perManaDao;
    @Autowired
    private PerMangeService perMangeService;
    @Test
    public void loginTest(){
        User user = new User();
        user.setUname("王五");
        user.setUpassword("123");
        User login = loginService.login(user);
        System.out.println(login);
    }
    @Test
    public void registerTest(){
        User user = new User();
        String s = UUID.randomUUID().toString();
        user.setUid(s);
        user.setUname("李四");
        user.setUtelephone("12345");
        user.setUpassword("123");
        int register = loginService.register(user);
        System.out.println(register);
    }
    @Test
    public void updatePassword(){
        User user = new User();
        user.setUid("房租费");
        user.setUpassword("1234");
        int i = loginService.updatePassword(user);
        System.out.println(i);
    }
    @Test
    public void selectAllUser(){
        Map<Object, Object> map = new HashMap<>();
        map.put("Page_number",1);
        pageBean pageBean = perMangeService.selectAll(map);
        System.out.println(pageBean);
    }
}
