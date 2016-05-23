package base;
/**
 * Lagou.com Llc.
 * Copyright (c) 2013-2015 All Rights Reserved.
 */


import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lagou.common.base.util.random.RandomUtil;

/**
 * @Description: 测试基类
 * @Author leo
 * @Date 2015-4-28 上午10:48:09
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/META-INF/spring/spring-base.xml",
                                    "classpath:/META-INF/spring/spring-dubbo.xml" })
public class BaseSpringTestConfig {
    private static long start = 0l;

    @Before
    public void before() {
        // 开始监控
        start = System.currentTimeMillis();
    }

    @After
    public void after() {
        // 停止监控
        final long time = System.currentTimeMillis() - start;
        System.out.println("耗时" + time + "\n");
    }

    public static int generateUserId() {
        return generateRandomInteger(5);
    }

    public static String generateEmail() {
        String prefix = generateRandomString(6);
        String suffix = generateRandomString(3);
        return prefix + "@" + suffix + ".com";
    }

    public static String generatePassword() {
        return generateRandomString(6);
    }

    public static String generateUserName() {
        return generateRandomString(6);
    }

    public static String generatePhone() {
        return "182" + generateRandomInteger(8);
    }

    public static String generateOpenId() {
        return "o_" + generateRandomString(12);
    }

    public static Integer generateRandomInteger(int size) {
        return Integer.valueOf(RandomUtil.getRandomNumber(size));
    }

    public static String generateRandomString(int size) {
        return RandomUtil.getRandomString(size);
    }
}