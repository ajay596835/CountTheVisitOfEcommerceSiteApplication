package org.example.countthevisitofecommercesite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisService {

    @Autowired
    private RedisTemplate redisTemplate;

    public void flushAll() {
        redisTemplate.getConnectionFactory().getConnection().flushAll();
    }
}
