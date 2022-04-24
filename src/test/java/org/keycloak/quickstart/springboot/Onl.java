package org.keycloak.quickstart.springboot;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * e
 *
 * @author zhanfei
 * @create 2022/4/20
 */

public class Onl {
    @Test
    public void encode(){
       BCryptPasswordEncoder PASSWORD_ENCODER = new BCryptPasswordEncoder();
        System.out.println(PASSWORD_ENCODER.encode("123456"));
       boolean b =PASSWORD_ENCODER.matches("123456","$2a$10$/Se4DuX4mv5vngD2zKjwp.eVH9KOZNI146wTxOYiw5ugvgDjD4YTu");
        System.out.println(b);
    }
}
