package org.example.countthevisitofecommercesite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VisitCounterController {

    @Autowired
    private StringRedisTemplate redisTemplate;
    @Autowired
    private RedisService redisService;

    private static final String VISIT_COUNT_KEY = "visitCount";

    @GetMapping("/visit")
    public String visit() {
        Long count = redisTemplate.opsForValue().increment(VISIT_COUNT_KEY);
        return "Number of visits: " + redisTemplate.opsForValue().get(VISIT_COUNT_KEY);
    }

    @GetMapping("/count")
    public String getCount() {
        String count = redisTemplate.opsForValue().get(VISIT_COUNT_KEY);
        return "Number of visits: " + (count != null ? count : "0");
    }

    @DeleteMapping("/flushall")
    public String flushAll() {
        redisService.flushAll();
        return "All data in Redis has been deleted.";
    }
}
