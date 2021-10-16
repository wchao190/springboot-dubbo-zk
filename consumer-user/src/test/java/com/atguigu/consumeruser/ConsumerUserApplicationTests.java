package com.atguigu.consumeruser;

import com.atguigu.consumeruser.service.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConsumerUserApplicationTests {

    @Autowired
    User user;
    @Test
    void contextLoads() {
        user.hello();
    }

}
