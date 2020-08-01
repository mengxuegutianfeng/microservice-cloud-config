package com.tianfeng.springbootredis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.util.Assert;

@SpringBootTest
class SpringbootredisApplicationTests {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    void contextLoads() {
    }

    @Test
    public void testStringRedis() throws Exception {
        stringRedisTemplate.opsForValue().set("aaa", "111");
    }

}
