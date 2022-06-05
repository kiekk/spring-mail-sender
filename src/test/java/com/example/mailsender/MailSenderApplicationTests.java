package com.example.mailsender;

import com.example.mailsender.util.MailUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySources;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(locations = "classpath:application.yml")
class MailSenderApplicationTests {

    @Autowired
    private MailUtil mailUtil;

    @Test
    void contextLoads() throws Exception {
        mailUtil.sendTemplateMail("dbstnsgh2@naver.com", "메일 테스트", "윤순호", null);
    }

}
