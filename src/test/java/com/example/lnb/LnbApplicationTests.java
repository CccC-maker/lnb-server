package com.example.lnb;

import com.example.lnb.mapper.UserMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootTest
class LnbApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @DisplayName("测试mybatis-plus操作")
    @Test
    void contextLoads() {

        //查


    }
}
